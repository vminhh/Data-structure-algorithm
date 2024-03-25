package tut5;

import java.util.*;

public class Compare {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter range: ");
        int n = inp.nextInt();
        int[] a = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100000000);
        }
        inp.close();

        long start, end;

        start = System.currentTimeMillis();
        countingSort(a);
        end = System.currentTimeMillis();
        System.out.println("Counting Sort RunTime: " + (end - start));

        start = System.currentTimeMillis();
        heapSort(a, n);
        end = System.currentTimeMillis();
        System.out.println("Heap Sort RunTime: " + (end - start));

        start = System.currentTimeMillis();
        quickSort(a, 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort RunTime: " + (end - start));

        start = System.currentTimeMillis();
        radixSort(a, n);
        end = System.currentTimeMillis();
        System.out.println("Radix Sort RunTime: " + (end - start));

    }

    private static void countingSort(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : a) {
            max = Math.max(max, i);
            min = Math.min(min, i);

        }

        int range = max - min + 1;
        int[] counts = new int[range];

        for (int i : a) {
            counts[i - min]++;
        }

        int idx = 0;
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < counts[i]; j++) {
                a[idx++] = i + min;
            }
        }
    }

    private static void heapSort(int[] a, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(a, i, 0);
            heapify(a, i, 0);
        }
    }

    private static void heapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && a[l] > a[largest]) {
            largest = l;
        }
        if (r < n && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, i, largest);
            heapify(a, n, largest);
        }
    }

    private static int partition(int[] a, int l, int r) {
        int pivot = a[l];
        int i = l - 1, j = r + 1;
        while (true) {
            do {
                ++i;
            } while (a[i] < pivot);
            do {
                --j;
            } while (a[j] > pivot);

            if (i < j) {
                swap(a, i, j);
            } else
                return j;
        }
    }

    private static void quickSort(int[] a, int l, int r) {
        if (l < r) {
            int p = partition(a, l, r);
            quickSort(a, l, p);
            quickSort(a, p + 1, r);
        }
    }

    private static void countSort(int[] a, int n, int exp) {
        int[] counts = new int[10];
        Arrays.fill(counts, 0);

        for (int i = 0; i < n; i++) {
            counts[(a[i] / exp) % 10]++;
        }

        int idx = 0;
        for (int i = 0; i < 10; i++) {
            while (counts[i] > 0) {
                a[idx++] = i * exp;
                counts[i]--;
            }
        }
    }

    private static void radixSort(int[] a, int n) {
        int max = Integer.MIN_VALUE;
        for (int value : a) {
            if (max < value)
                max = value;
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(a, n, exp);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}

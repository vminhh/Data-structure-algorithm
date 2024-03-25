package tut5.act3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of list: ");
        int size = inp.nextInt();
        inp.nextLine();

        String[] list = new String[size];
        System.out.println(String.format("Enter %d string separated by one line", size));
        for (int i = 0; i < size; i++) {
            list[i] = inp.nextLine();
        }

        radixSort(list, size, list[0].length());
        System.out.println("Succeeded!");
        System.out.println(Arrays.toString(list));

        inp.close();
    }

    private static void countSort(String[] a, int n, int exp) {
        int[] counts = new int[256];
        Arrays.fill(counts, 0);

        for (int i = 0; i < n; i++) {
            counts[a[i].charAt(exp)]++;
        }

        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }

        String[] sorted = new String[n];
        for (int i = n - 1; i >= 0; i--) {
            sorted[counts[a[i].charAt(exp)] - 1] = a[i];
            counts[a[i].charAt(exp)]--;
        }

        System.arraycopy(sorted, 0, a, 0, n);
    }

    private static void radixSort(String[] a, int n, int m) {
        int max = getMax(a, n, m);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(a, n, exp);
        }
    }

    private static int getMax(String a[], int n, int m) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i].length() > m && a[i].charAt(m) > max) {
                max = a[i].charAt(m);
            }
        }
        return max;
    }
}

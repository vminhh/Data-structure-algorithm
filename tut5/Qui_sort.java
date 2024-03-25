package tut5;

import java.util.*;

public class Qui_sort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the arr length: ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Result: " + Arrays.toString(arr));
        inp.close();
    }

    // lomuto
    /*
    private static int partition(int[] a, int l, int r) {
        int pivot = a[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (a[j] <= pivot) {
                ++i;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }
    */

    // hoare
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
            // quickSort(a, l, p - 1); for lomuto
            quickSort(a, l, p); // for hoare
            quickSort(a, p + 1, r);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}

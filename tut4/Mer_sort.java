package tut4;

import java.util.*;

public class Mer_sort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the arr length: ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        merSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
        inp.close();
    }

    private static void mer(int[] a, int l, int m, int r) {
        int x = m - l + 1;
        int y = r - m;
        int[] a_left = new int[x];
        int[] a_right = new int[y];

        for (int i = 0; i < x; i++) {
            a_left[i] = a[l + i];
        }
        for (int i = 0; i < y; i++) {
            a_right[i] = a[m + 1 + i];
        }

        int i = 0, j = 0, k = l;
        while (i < x && j < y) {
            if (a_left[i] <= a_right[j]) {
                a[k] = a_left[i];
                ++i;
            } else {
                a[k] = a_right[j];
                ++j;
            }
            ++k;
        }

        while (i < x) {
            a[k] = a_left[i];
            ++i;
            ++k;
        }
        while (j < y) {
            a[k] = a_right[j];
            ++j;
            ++k;
        }
    }

    static void merSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            merSort(a, l, m);
            merSort(a, m + 1, r);
            mer(a, l, m, r);
        }
    }
}

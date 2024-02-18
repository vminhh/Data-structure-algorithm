package tut4;

import java.util.*;

public class SortAlgorCompare {
    public static void main(String[] args) {
        int[] a = new int[100000];

        Random rand = new Random();
        for (int i = 0; i < 100000; i++) {
            a[i] = rand.nextInt(Integer.MAX_VALUE);
        }

        long start, end;

        start = System.currentTimeMillis();
        sel(a);
        end = System.currentTimeMillis();
        System.out.println("Seclention RunTime: " + (end - start));

        start = System.currentTimeMillis();
        ins(a);
        end = System.currentTimeMillis();
        System.out.println("Insertion RunTime: " + (end - start));

        start = System.currentTimeMillis();
        bub(a);
        end = System.currentTimeMillis();
        System.out.println("Bubble RunTime: " + (end - start));

        start = System.currentTimeMillis();
        merSort(a, 0, a.length - 1);
        end = System.currentTimeMillis();
        System.out.println("Merge RunTime: " + (end - start));

    }

    private static int[] sel(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min_idx] > a[j])
                    min_idx = j;
            }
            int temp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = temp;
        }
        return a;
    }

    private static int[] ins(int[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && key < a[j]) {
                a[j + 1] = a[j];
                j += -1; // j -= 1 =))
                a[j + 1] = key;
            }

        }
        return a;
    }

    private static int[] bub(int[] a) {
        int n = a.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return a;
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

    private static void merSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            merSort(a, l, m);
            merSort(a, m + 1, r);
            mer(a, l, m, r);
        }
    }
}

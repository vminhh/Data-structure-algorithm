package tut5;

import java.util.*;

public class Rad_sort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the arr length: ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        radixSort(arr, n);
        System.out.println("Result: " + Arrays.toString(arr));
        inp.close();
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
}

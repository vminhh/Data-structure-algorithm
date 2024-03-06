package tut5;

import java.util.*;

public class Cou_sort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the arr length: ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        couting_Sort(arr);
        System.out.println("Result: " + Arrays.toString(arr));
        inp.close();
    }

    // for all integer number
    @SuppressWarnings("unused")
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

    // for positive number
    private static void couting_Sort(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i : a) {
            max = Math.max(max, i);
        }

        int[] counts = new int[max + 1];
        for (int i : a) {
            counts[i]++;
        }

        int idx = 0;
        for (int i = 0; i <= max; i++) {
            while (counts[i] > 0) {
                    a[idx++] = i;
                    counts[i]--;
            }
        }
    }
}

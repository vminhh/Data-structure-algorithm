package tut4;

import java.util.*;

public class ReArrangeUpd {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the arr length: ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(counting_sort(arr)));
        inp.close();
    }

    private static int[] counting_sort(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : a) {
            max = (max < i) ? i : max;
            min = (min > i) ? i : min;
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

        return a;
    }

}

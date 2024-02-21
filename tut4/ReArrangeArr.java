package tut4;

import java.util.*;

public class ReArrangeArr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the arr length: ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(bub(arr)));
        inp.close();
    }

    static int[] bub(int[] a) {
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
}

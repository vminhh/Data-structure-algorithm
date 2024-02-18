package tut4;

import java.util.*;

public class Ins_sort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the arr length: ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(ins(arr)));
        inp.close();
    }

    static int[] ins(int[] a) {
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
}

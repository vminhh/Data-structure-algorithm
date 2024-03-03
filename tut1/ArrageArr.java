package tut1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrageArr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int N = inp.nextInt();

        int[] arr = new int[5];
        for (int i = 0; i < N; i++) {
            arr[i] = inp.nextInt();
        }

        inp.close();
        System.out.println(Arrays.toString(arrange(arr)));

    }

    static int[] arrange(int[] arr) {
        boolean swapped;
        int n = arr.length;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        return arr;
    }
}

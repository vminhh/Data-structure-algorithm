package tut1;

import java.util.*;

public class MaxinArr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of list: ");
        int N = inp.nextInt();

        int[] arr = new int[N];
        System.out.print("Enter the list: ");
        for (int i = 0; i < N; i++) {
            arr[i] = inp.nextInt();
        }

        inp.close();

        Arrays.sort(arr);
        System.out.print("Max: " + arr[N - 1]);
    }
}
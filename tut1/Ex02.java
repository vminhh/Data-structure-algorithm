package tut1;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the range of array: ");
        int n = inp.nextInt();
        inp.close();

        if (n <= 0) {
            System.out.println("Error...");
            return;
        }

        System.out.println("Random Arr: " + Arrays.toString(CreatArr(n)));
    }

    private static int[] CreatArr(int n) {
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt();
        }

        return arr;
    }
}

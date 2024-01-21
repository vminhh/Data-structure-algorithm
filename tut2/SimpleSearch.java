package tut2;

import java.util.*;

public class SimpleSearch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int[] a = new int[n];

        System.out.print("Enter the sorted array: ");
        for (int i=0; i<n; i++){
            a[i] = inp.nextInt();
        }

        System.out.print("Enter the integer to search: ");
        int m = inp.nextInt();
        int position = simpleSearch(a, n, m);

        System.out.println(position !=-1 ?"Element found at index " + position :"Element not found" );
        inp.close();
    }

    static int simpleSearch(int[] a, int n, int m){
        for (int i=0; i<n; i++){
            if (a[i] == m)
                return i;
        }
        return -1;
    }
}

// O(n)
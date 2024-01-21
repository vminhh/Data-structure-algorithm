package tut2;

import java.util.*;

public class ImproveSimpleSearch {
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
        int position = binarySearch(a, n, m);

        System.out.println(position !=-1 ?"Element found at index " + position :"Element not found");
        inp.close();
    }
    
    static int binarySearch(int[] a, int n, int m){
        int low =0, high = a.length;

        while (low <= high){
            int mid = (low + high) / 2;

            if (a[mid] == m)
                return mid;
            
            else if (a[mid] > m)
                low = mid + 1;
            
            else high = mid - 1;
        }

        return -1;
    }
}

// O(log n)
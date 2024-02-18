package tut4;

public class Sel_sort {
    public static void main(String[] args) {
        java.util.Scanner inp = new java.util.Scanner(System.in);

        System.out.print("Enter the arr length: ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.println("Result: " + java.util.Arrays.toString(sel(arr)));
        inp.close();
    }

    static int[] sel(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min_idx] > a[j])
                    min_idx = j;
            }
            int temp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = temp;
        }
        return a;
    }
}

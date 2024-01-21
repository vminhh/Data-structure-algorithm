package tut2;

import java.util.*;

public class ImproveSimpleGCD {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int m = inp.nextInt(), n = inp.nextInt();

        System.out.print("GCD = " + improveSimpleGCD(m, n));
        inp.close();
    }

    static int improveSimpleGCD(int m, int n){    
        if (n == 0)
            return m;

        return improveSimpleGCD(n, m % n);
    }
}

// O(log n) https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/
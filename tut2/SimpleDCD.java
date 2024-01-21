package tut2;

import java.util.*;

public class SimpleDCD {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int m = inp.nextInt(), n = inp.nextInt();

        System.out.print("GCD = " + simpleGCD(m, n));
        inp.close();
    }

    static int simpleGCD(int m, int n){
        int i = n;
        while (i>1){
            if (m % i ==0 && n % i ==0)
                return i;
            
            i--;
        }

        return 1;
    }
}

// O(n)
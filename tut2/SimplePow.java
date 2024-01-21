package tut2;

import java.util.*;

public class SimplePow {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.print("Enter the real number x: ");
        double x = inp.nextDouble();

        System.out.print("Enter the integer n: ");
        int n = inp.nextInt();

        System.out.println("x power n: " + simplePow(x, n));
        inp.close();
    }
    
    static double simplePow(double x,int n){
        double s = 1.0;
        if (n == 0)
            return s;
        
        for (int i=1; i<=n; i++){
            s *= x;
        }

        return s;
    }
}

// O(n)
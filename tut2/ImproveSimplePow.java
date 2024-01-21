package tut2;

import java.util.*;

public class ImproveSimplePow {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.print("Enter the real number x: ");
        double x = inp.nextDouble();

        System.out.print("Enter the integer n: ");
        int n = inp.nextInt();

        System.out.println("x power n: " + improveSimplePow(x, n));
        inp.close();
    }

    static double improveSimplePow(double x, int n){
        if (n == 0)
            return 1.0;
        
        return (n % 2 == 0) ? improveSimplePow(x, n/2) * improveSimplePow(x, n/2) : improveSimplePow(x, n-1) * x;
    }
}

// O(log n)
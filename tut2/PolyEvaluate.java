package tut2;

import java.util.*;

public class PolyEvaluate {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the degree of the polynomial (n): ");
        int n = inp.nextInt();

        System.out.println("Enter the coefficients of the polynomial (c):");
        double[] c = new double[n];

        for (int i=0; i<n; i++){
            c[i] = inp.nextDouble();
        }

        System.out.print("Enter the value of x: ");
        double x = inp.nextDouble();

        System.out.println("The value of f(x) = "+ polyEvaluate(c, n, x));
        inp.close();
    }

    static double polyEvaluate(double[] c, int n, double x){
        double s = 0.0;
        for (int i=0; i<n; i++){
            double p = 1.0;
            if (i != 0){
                for (int k=1; k<i; k++){
                    p *= x;
                }
                s += c[i] * p;
            }
        }
        return s;
    }
}

// O(n^2)
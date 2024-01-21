package tut2;

import java.util.Scanner;

public class ImprovePolyEvaluate {
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

        System.out.println("The value of f(x) = "+ improvePolyEvaluate(c, n, x));
        inp.close();
    }

    static double improvePolyEvaluate(double[] c, int n, double x){
        double result = c[n-1];

        for (int i=n-2; i>=0; i--){
            result = result * x + c[i];
        }
        return result;
    }
}

// O(n)  https://www.geeksforgeeks.org/horners-method-polynomial-evaluation/

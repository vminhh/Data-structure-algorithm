package tut1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = inp.nextDouble();

        System.out.print("Enter the second number: ");
        double b = inp.nextDouble();

        System.out.println(Comparision(a, b) ? "They are the same." : "They are different.");
        inp.close();

    }

    private static double Round(double d) {
        return Math.round(d * 1000.0) / 1000.0;
    }

    private static boolean Comparision(double a, double b) {
        return Round(a) == Round(b);
    }
}
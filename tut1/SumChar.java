package tut1;

import java.util.*;

public class SumChar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = inp.nextLine();

        System.out.println("Sum of characters: " + sumChar(input));
        inp.close();
    }

    private static int sumChar(String inp) {
        if (inp == null || inp.isEmpty())
            return 0;

        int sum = 0;
        for (char c : inp.toCharArray()) {
            if (!Character.isWhitespace(c))
                sum++;
        }
        return sum;
    }
}
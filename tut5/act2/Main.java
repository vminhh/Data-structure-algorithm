package tut5.act2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of list: ");
        int size = inp.nextInt();
        inp.nextLine();

        String[] list = new String[size];
        System.out.println(String.format("Enter %d string separated by one line", size));
        for (int i = 0; i < size; i++) {
            list[i] = inp.nextLine();
        }

        Arrays.sort(list);
        System.out.println("Succeeded\n" + Arrays.toString(list));

        inp.close();
    }
}

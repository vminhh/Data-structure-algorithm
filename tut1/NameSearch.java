package tut1;

import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int N = inp.nextInt();
        inp.nextLine();

        String[] names = new String[N];

        System.out.print("Enter the name respectively: ");
        for (int i = 0; i < N; i++) {
            names[i] = inp.nextLine();
        }

        System.out.print("Enter the name to search: ");
        String searchName = inp.nextLine();

        System.out.println("Position: " + findPosition(names, searchName));
        inp.close();
    }

    static int findPosition(String[] names, String searchName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                return i + 1;
            }
        }
        return -1;
    }
}


package tut5.act1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of list: ");
        int n = inp.nextInt();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = inp.next();
            System.out.print("Mark: ");
            int mark = inp.nextInt();
            students.add(new Student(name, mark));
            System.out.println("-----------");
        }

        System.out.print("Enter number of top students: ");
        int m = inp.nextInt();
        quickSelection(students, 0, n - 1, m);
        System.out.println("-------------");
        for (int i = 0; i < Math.min(m, students.size()); i++) {
            System.out.println("\t" + students.get(i).getName());
        }
        System.out.println("Display succeeded!");

        inp.close();
    }

    private static void quickSelection(List<Student> students, int l, int r, int m) {
        if (l != r) {
            int p = partition(students, l, r);
            if (m == p) {
                return;
            } else if (m < p) {
                quickSelection(students, l, p - 1, m);
            } else {
                quickSelection(students, p + 1, r, m);
            }
        }
    }

    private static int partition(List<Student> students, int l, int r) {
        int pivot = students.get(r).getMark();
        int i = l;
        for (int j = l; j < r; j++) {
            if (students.get(j).getMark() > pivot) {
                Collections.swap(students, i, j);
                ++i;
            }
        }
        Collections.swap(students, i, r);
        return i;
    }
}

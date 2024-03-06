package tut4;

import java.util.*;

public class HighMarkStu {
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
            System.out.println("------------");
        }

        System.out.print("Enter M: ");
        int m = inp.nextInt();

        Collections.sort(students, Collections.reverseOrder());

        System.out.println("Top " + m + " students:");
        for (int i = 0; i < Math.min(m, students.size()); i++) {
            System.out.println(students.get(i).getName());
        }

        inp.close();
    }

    private static class Student implements Comparable<Student> {
        private String name;
        private int mark;

        public Student(String name, int mark) {
            this.name = name;
            this.mark = mark;
        }

        public String getName() {
            return name;
        }

        @SuppressWarnings("unused")
        public int getMark() {
            return mark;
        }

        public int compareTo(Student other) {
            return Integer.compare(this.mark, other.mark);
        }
    }
}
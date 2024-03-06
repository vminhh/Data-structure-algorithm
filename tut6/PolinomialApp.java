package tut6;

public class PolinomialApp {
    public static void main(String[] args) {
        Polynomial test = new Polynomial();

        test.addTerm(1, 4);
        test.addTerm(2, 3);
        test.addTerm(3, 2);
        test.addTerm(4, 1);
        test.addTerm(5, 0);
        test.print();

        System.out.println("F(2) = " + test.plus(2));
    }
}

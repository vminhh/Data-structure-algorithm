package tut7.Sample1;

public class ArrayStackApp {
    public static void main(String[] args) {
        ArrayStack test = new ArrayStack(100);

        test.push("m");
        test.push("i");
        test.push("n");
        test.push("h");
        System.out.print("Origin Stack: ");
        printStack(test);

        ArrayStack copyTest = new ArrayStack(100);
        copyStack(test, copyTest);
        System.out.print("Copied Stack: ");
        printStack(copyTest);
    }

    private static void copyStack(ArrayStack src, ArrayStack des) {
        while (!src.isEmpty()) {
            des.push(src.pop());
        }
    }

    private static void printStack(ArrayStack s) {
        ArrayStack tmp = new ArrayStack(100);
        while (!s.isEmpty()) {
            String item = s.pop();
            System.out.print(item + " ");
            tmp.push(item);
        }
        System.err.println();

        while (!tmp.isEmpty()) {
            s.push(tmp.pop());
        }
    }
}

package tut8.Sample2;

public class StackReversing {
    public static void main(String[] args) {
        SLLStack stack = new SLLStack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');

        System.out.println("Stack: " + stack);

        ArrayQueue queue = new ArrayQueue(100);

        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }

        while (!queue.isEmpty()) {
            stack.push(queue.dequeue());
        }

        System.out.println("Reversed Stack: " + stack);
    }
}

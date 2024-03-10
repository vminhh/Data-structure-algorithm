package tut7.Ex2;

public class Main {
    public static void main(String[] args) {
        Queue birthday = new Queue(100);
        birthday.enqueue(25);
        birthday.enqueue(3);
        birthday.enqueue(2004);
        birthday.display();

        birthday.dequeue();
        birthday.display();
    }
}

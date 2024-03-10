package tut7.Ex1;

public class Main {
    public static void main(String[] args) {
        Stack test = new Stack();
        test.push('h');
        test.push('n');
        test.push('i');
        test.push('m');
        test.display();

        Stack birthday = new Stack();
        birthday.push('3');
        birthday.push('0');
        birthday.push('5');
        birthday.push('2');
        birthday.push('!');
        birthday.pop();
        birthday.peak();
        birthday.display();
    }
}

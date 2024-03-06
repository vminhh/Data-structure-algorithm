package tut6;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(100);

        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size());
        list.printList();;

        list.remove(2);
        list.printNode(2);
        list.printList();
    }
}

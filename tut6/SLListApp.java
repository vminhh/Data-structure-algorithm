package tut6;

public class SLListApp {
    public static void main(String[] args) {
        SLList list = new SLList();
        list.add(new SLNode("Minh"));
        list.add(new SLNode("I'm"));
        list.add(new SLNode("Hi"));
        System.out.println(list.size());
        list.print();

        list.remove(0);
        list.add(new SLNode("Greeting everyone,"));
        list.remove(1);
        list.addAt(1, new SLNode("My name is"));
        System.out.println(list.size());
        list.print();
        
        String test1 = "Minh";
        System.out.println(String.format(" %s found at %d at list.", test1, list.search(test1)));
        String test2 = "My name is Minh";
        System.out.println(String.format(" %s found at %d at list.", test2, list.search(test2)));
    }
}

package tut6;

public class SLList {
    private SLNode head;
    private int size = 0;

    public SLList() {
        this.head = null;
    }

    public void add(SLNode n) {
        n.setNext(head);
        head = n;
        ++size;
    }

    public void remove(int pos) {
        if (isEmpty())
            throw new IndexOutOfBoundsException("List is empty!");

        else if (pos < 0)
            throw new IndexOutOfBoundsException("Invalid posistion. Can not remove!");

        else {
            if (pos == 0) {
                head = head.getNext();
            } else {
                SLNode curr = head;
                for (int i = 0; i < pos - 1; i++) {
                    curr = curr.getNext();
                }
                curr.setNext(curr.getNext().getNext());
            }
            /*
             * else {
             * SLNode prevNode = head;
             * for (int i = 0; i < pos - 1; i++) {
             * prevNode = prevNode.getNext();
             * }
             * SLNode nextNode = prevNode.getNext().getNext();
             * prevNode.setNext(nextNode);
             * }
             */
            --size;
        }
    }

    /*
     * public void removeAll() {
     * head = null;
     * size = 0;
     * }
     * 
     * public SLNode get(){
     * return head;
     * }
     */

    public void addAt(int pos, SLNode newNode) {
        if (pos < 0)
            throw new IndexOutOfBoundsException("Invalid posistion. Can not add!");

        if (pos == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            SLNode curr = head;
            for (int i = 0; i < pos - 1; i++) {
                curr = curr.getNext();
            }
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
        }
        ++size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        SLNode curr = head;
        System.out.print("List: ");
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

    public int search(String data) {
        SLNode curr = head;
        int pos = 0;
        while (curr != null) {
            if (curr.getData().equals(data))
                return pos;

            curr = curr.getNext();
            ++pos;
        }
        return -1;
    }
}

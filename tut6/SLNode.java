package tut6;

public class SLNode {
    private String data;
    private SLNode next;

    public SLNode(String data) {
        this.data = data;
        this.next = null;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode n) {
        this.next = n;
    }

    public String getData() {
        return data;
    }
    
    /* 
    public void setData(String data) {
        this.data = data;
    }
    */

    public void print() {
        System.out.println("Data: " + data);
    }
}

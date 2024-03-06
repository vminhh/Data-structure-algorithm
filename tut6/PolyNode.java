package tut6;

public class PolyNode {
    private int coe;
    private int exp;
    private PolyNode next;

    public PolyNode(int coe, int exp) {
        this.coe = coe;
        this.exp = exp;
        this.next = null;
    }

    public int getCoe() {
        return coe;
    }

    public int getExp() {
        return exp;
    }

    public PolyNode getNext() {
        return next;
    }

    public void setNext(PolyNode n) {
        this.next = n;
    }

    /* 
    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setCoe(int coe) {
        this.coe = coe;
    }
    */
}

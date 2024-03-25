package tut6;

public class Polynomial {
    private PolyNode head;

    @SuppressWarnings("unused")
    private int size = 0;

    public Polynomial() {
        this.head = null;
    }

    public void addTerm(int coe, int exp) {
        PolyNode newNode = new PolyNode(coe, exp);
        if (head == null || exp > head.getExp()) {
            newNode.setNext(head);
            head = newNode;
        } else {
            PolyNode curr = head;
            while (curr.getNext() != null && exp < curr.getNext().getExp()) {
                curr = curr.getNext();
            }
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
        }
        ++size;
    }

    public void print() {
        StringBuilder polyStr = new StringBuilder();
        PolyNode curr = head;

        while (curr != null) {
            if (curr.getCoe() != 0) {
                if (polyStr.length() > 0)
                    polyStr.append(" + ");

                if (curr.getCoe() != 1)
                    polyStr.append(curr.getCoe());

                if (curr.getExp() != 0) {
                    if (curr.getExp() == 1)
                        polyStr.append("x");
                    else
                        polyStr.append("x^").append(curr.getExp());
                }
            }
            curr = curr.getNext();
        }
        System.out.println("F(x) = " + polyStr.toString());
    }

    public double plus(double x) {
        double result = 0;
        PolyNode curr = head;
        while (curr != null) {
            result += curr.getCoe() * Math.pow(x, curr.getExp());
            curr = curr.getNext();
        }
        return result;
    }

    // khong di hoc lec nen chua biet la nen them gi nua =))
}

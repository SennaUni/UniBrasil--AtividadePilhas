package LinkedList_End;

public class Node {
    private String element;
    private Node next;

    public Node() {
        this(null, null);
    }

    public Node(String e, Node n) {
        this.element = e;
        this.next = n;
    }

    public String getElement() {
        return this.element;
    }
    public Node getNext() {
        return this.next;
    }

    public void setElement(String newElement) {
        this.element = newElement;
    }
    public void setNext(Node newNext) {
        this.next = newNext;
    }

    @Override
    public String toString() {
        return "Node { " + this.element + " }";
    }
}

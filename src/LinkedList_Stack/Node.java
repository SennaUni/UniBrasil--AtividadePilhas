package LinkedList_Stack;

public class Node {
    private String element;
    private Node next;

    public Node() {
        this(null, null);
    }

    public Node(String e, Node n) {
        element = e;
        next = n;
    }

    public String getElement() {
        return element;
    }
    public Node getNext() {
        return next;
    }

    public void setElement(String newElement) {
        element = newElement;
    }
    public void setNext(Node newNext) {
        next = newNext;
    }
}

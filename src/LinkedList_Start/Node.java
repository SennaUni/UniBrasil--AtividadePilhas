package LinkedList_Start;

public class Node<E> {
    private E element;
    private Node<E> next;
    public Node() {
        this(null, null);
    }

    public Node(E e, Node<E> n) {
        this.element = e;
        this.next = n;
    }

    public E getElement() {
        return this.element;
    }
    public Node<E> getNext() {
        return this.next;
    }

    public void setElement(E newElem) {
        this.element = newElem;
    }
    public void setNext(Node<E> newNext) {
        this.next = newNext;
    }

    @Override
    public String toString() {
        return "Node { " + this.element + " }";
    }
}

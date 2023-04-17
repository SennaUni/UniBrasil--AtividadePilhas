package DoublyLinkedList;

public class Node<E> {
    private E element;
    private Node<E> next, prev;
    public Node() {
        this(null, null, null);
    }
    public Node(E e, Node<E> p, Node<E> n) {
        element = e;
        next = n;
        prev = p;
    }
    public void setElement(E newElem) {
        element = newElem;
    }
    public void setNext(Node<E> newNext) {
        next = newNext;
    }
    public void setPrev(Node<E> newPrev) {
        prev = newPrev;
    }
    public E getElement() {
        return element;
    }
    public Node<E> getNext() {
        return next;
    }
    public Node<E> getPrev() {
        return prev;
    }
}

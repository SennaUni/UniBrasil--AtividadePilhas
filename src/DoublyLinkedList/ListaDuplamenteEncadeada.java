package DoublyLinkedList;

public class ListaDuplamenteEncadeada {
    protected int size;
    protected Node header, trailer;

    public ListaDuplamenteEncadeada() {
        size = 0;
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.setNext(trailer);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public Node getFirst() throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        return header.getNext();
    }

    public Node getLast() throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        return trailer.getPrev();
    }

    public Node getPrev(Node v) throws IllegalArgumentException {
        if (v == header) throw new IllegalArgumentException("Cannot move back past the header of the list");
        return v.getPrev();
    }

    public Node getNext(Node v) throws IllegalArgumentException {
        if (v == trailer) throw new IllegalArgumentException("Cannot move forward past the trailer of the list");
        return v.getNext();
    }

    public void addBefore(Node v, Node z) throws IllegalArgumentException {
        Node u = getPrev(v);
        z.setPrev(u);
        z.setNext(v);
        v.setPrev(z);
        u.setNext(z);
        size++;
    }

    public void addAfter(Node v, Node z) {
        Node w = getNext(v);
        z.setPrev(v);
        z.setNext(w);
        w.setPrev(z);
        v.setNext(z);
        size++;
    }

    public void addFirst(Node v) {
        addAfter(header, v);
    }

    public void addLast(Node v) {
        addBefore(trailer, v);
    }

    public void remove(Node v) {
        Node u = getPrev(v);
        Node w = getNext(v);
        w.setPrev(u);
        u.setNext(w);
        v.setPrev(null);
        v.setNext(null);
        size--;
    }


    @Override
    public String toString() {
        String r = "";
        Node n = this.getFirst();
        String s = (String)n.getElement();
        r = s + "\n";


        while (n != this.trailer) {
            n = n.getNext();
            if ( n.getElement() != null) {
                r = r + (String) n.getElement();
                r += "\n";
            }
        }
        return r;
    }
}

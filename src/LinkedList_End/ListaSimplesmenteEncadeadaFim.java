package LinkedList_End;

public class ListaSimplesmenteEncadeadaFim {
    protected Node head;
    protected Node tail;
    protected long size;

    public ListaSimplesmenteEncadeadaFim(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addNewNode(String elemento){
        Node n  = new Node();
        n.setElement(elemento);
        n.setNext(null);

        if (this.size == 0) this.head = n;
        else this.tail.setNext(n);

        this.tail = n;
        this.size++;
    }

    public void removeNode(){
        Node actual = this.head;
        boolean keepLoop = true;

        while (keepLoop) {
            if (actual.getNext() == this.tail) {
                this.tail = actual;
                this.tail.setNext(null);
                this.size--;
                keepLoop = false;
            } else {
                actual = actual.getNext();
            }
        }
    }

    public void removeAll(){
        boolean keepLoop = true;

        while (keepLoop) {
            if (this.head.getNext() == null) {
                this.size--;
                keepLoop = false;
                this.head = null;
            } else {
                this.removeNode();
            }
        }
    }

    @Override
    public String toString() {
        String itemsLista = "";
        Node i = this.head;
        while (i != null) {
            itemsLista += i.getElement() + " \n";
            i = i.getNext();
        }
        return "ListaSimplesmenteEncadeada {" +
                "\nhead: " + this.head +
                "\nsize: " + this.size +
                "\nElementos da lista:  \n{\n" + itemsLista +
                '}';
    }
}

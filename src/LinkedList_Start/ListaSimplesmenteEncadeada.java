package LinkedList_Start;

public class ListaSimplesmenteEncadeada<E> {
    protected Node head;
    protected long size;

    public ListaSimplesmenteEncadeada(){
        this.head = null;
        this.size = 0;
    }

    /**
     * Adiciona uma novo elemento na cabeça da lista, deslocando a cabeça atual;
     * @param elemento Elemento a ser inserido
     */
    public void addNewNode(E elemento){
        Node node  = new Node();
        node.setElement(elemento);
        node.setNext(this.head);
        this.head = node;
        this.size++;
    }

    /**
     * Remove o nó da cabeça da lista
     */
    public void removeNode(){
        Node node = this.head;
        this.head = this.head.getNext();
        node = null;
        this.size--;
    }

    public void removeAll(){
        while (this.head != null){
            this.removeNode();
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

package LinkedList_Stack;

public class LinkedList_StackString implements StackInterface {
    protected int capacity;
    protected Node top;

    public LinkedList_StackString(){
        this.top = null;
        this.capacity = 0;
    }

    @Override
    public int size() {
        return this.capacity;
    }

    @Override
    public boolean isEmpty() {
        return this.capacity == 0;
    }

    @Override
    public String top() {
        if (this.top == null) return "Pilha vazia";
       return this.top.toString();
    }

    @Override
    public void push(String element) {
        if (this.size() == 0) {
            Node node  = new Node(element, null);
            this.top = node;
        } else {
            Node node  = new Node(element, this.top);
            this.top = node;
        }

        this.capacity++;
        System.out.println("Elemento inserido: " + element);
    }

    @Override
    public String pop() {
        if (this.size() == 0) return "Não há o que apagar em uma lista vazia!";

        System.out.println("Elemento removido: " + this.top.getElement());
        Node newHead = this.top.getNext();
        this.top = newHead;
        this.capacity--;

        if (newHead == null) return "[ Stack vazia ]";

        return newHead.toString();
    }

    @Override
    public String toString() {
        if (this.isEmpty()) return "[ Stack vazia ]";

        String returnString = "[";
        Node actualNode = this.top;
        boolean keepLopping = true;

        while(keepLopping) {
            if (actualNode.getNext() == null) {
                returnString += actualNode.getElement();
                keepLopping = false;
            } else {
                returnString += actualNode.getElement() + ", ";
                actualNode = actualNode.getNext();
            }
        }

        return returnString + "]";
    }
}

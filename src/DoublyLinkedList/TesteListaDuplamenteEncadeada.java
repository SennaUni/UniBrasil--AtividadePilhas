package DoublyLinkedList;

public class TesteListaDuplamenteEncadeada {
    public void execute(){
        ListaDuplamenteEncadeada dl = new ListaDuplamenteEncadeada();
        Node node, node1, node2;

        node1 = new Node();
        node1.setElement("José");

        dl.addFirst(node1);

        node2  = new Node();
        node2.setElement("João Carlos");
        dl.addAfter(node1, node2);

        node = new Node();
        node.setElement("Mais um nome incluído");
        dl.addAfter(node2, node);

        System.out.println("+-----------------------------------+ ");
        System.out.println("Lista : ");
        System.out.println(dl);
        System.out.println("+-----------------------------------+ ");
    }
}

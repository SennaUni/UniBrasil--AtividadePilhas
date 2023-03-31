package LinkedList_End;

public class TesteListaSimplesmenteEncadeadaFim {
    public void execute(){
        ListaSimplesmenteEncadeadaFim l = new ListaSimplesmenteEncadeadaFim();
        testarAdicionarNode(l);
        testarRemover1Elemento(l);
        testarRemoverTodosElementos(l);
    }
    private void testarAdicionarNode(ListaSimplesmenteEncadeadaFim l){
        l.addNewNode("primeiro item");
        l.addNewNode("Segundo item");
        l.addNewNode("Terceiro item");
        l.addNewNode("Quarto item");
        l.addNewNode("Quinto item");
        l.addNewNode("Sexto item");
        l.addNewNode("Sétimo item");

        System.out.println("Lista após as inserções" );
        System.out.println("List: "+ l.toString());
    }

    private void testarRemover1Elemento(ListaSimplesmenteEncadeadaFim  l){
        System.out.println("Removendo um ítem da lista" );
        l.removeNode();
        System.out.println("List: "+ l.toString());
    }

    private void testarRemoverTodosElementos( ListaSimplesmenteEncadeadaFim l){
        System.out.println("Removendo todos os itens" );
        l.removeAll();
        System.out.println("List: "+ l);
    }
}



package LinkedList_Stack;

public class TesteLinkedList_Slack {
    private LinkedList_StackString Pilha;

    public TesteLinkedList_Slack() {
        this.Pilha = new LinkedList_StackString();
    }

    public void execute() {
        System.out.println("Apresentação da Pilha: " + this.Pilha.toString());

        System.out.println("Iniciando a inserção dos nomes");

        this.Pilha.push("Maria");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Antonio");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Unibrasil");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Marcos");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("João");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Karine");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Karina");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Luíz");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("José");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Gabriel Senna Simão");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());

        System.out.println("Apresentação da Pilha: " + this.Pilha.toString());

        System.out.println("Iniciando a remoção dos nomes");

        this.Pilha.pop();
        this.Pilha.pop();
        this.Pilha.pop();
        this.Pilha.pop();
        this.Pilha.pop();
        this.Pilha.pop();
        this.Pilha.pop();
        this.Pilha.pop();
        this.Pilha.pop();
        this.Pilha.pop();

        System.out.println("Apresentação da Pilha vazia: " + this.Pilha.toString());
    }
}

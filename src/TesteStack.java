public class TesteStack {
    private StackString Pilha;

    public TesteStack() {
        this.Pilha = new StackString();
    }

    public TesteStack(int capacity) {
        this.Pilha = new StackString(capacity);
    }

    public void execute() {
        System.out.println("Iniciando a inserção dos nomes");

        this.Pilha.push("João");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Maria");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Antonio");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Unibrasil");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Marcos");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Eugênio");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Leão");
        System.out.println("Tamanho da pilha : " + this.Pilha.size());
        this.Pilha.push("Joaquim");
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

        System.out.println("Iniciando a tratavida do erro");

        this.Pilha.pop();
    }
}

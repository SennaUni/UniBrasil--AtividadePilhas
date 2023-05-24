package Order;

public class InsertSearch {
    private void insere(int valor, int vetor[], int n, Order order) {
        if (order == Order.DESC) {
            while (n > 0 && valor > vetor[n - 1]) {
                vetor[n] = vetor[n - 1];
                n--;
            }
            vetor[n] = valor;
        } else {
            while (n > 0 && valor < vetor[n - 1]) {
                vetor[n] = vetor[n - 1];
                n--;
            }
            vetor[n] = valor;
        }
    }

    private void insere(String valor, String vetor[], int n, Order order) {
        if (order == Order.DESC) {
            while (n > 0 && valor.compareTo(vetor[n - 1]) > 0) {
                vetor[n] = vetor[n - 1];
                n--;
            }
            vetor[n] = valor;
        } else {
            while (n > 0 && valor.compareTo(vetor[n - 1]) < 0) {
                vetor[n] = vetor[n - 1];
                n--;
            }
            vetor[n] = valor;
        }
    }

    private void insertion_sort(int vetor[], int n) {
        for (int i = 0; i < n; i++) {
            this.insere(vetor[i], vetor, i, Order.DESC);
        }
    }

    private void insertion_sort(String vetor[], int n) {
        for (int i = 0; i < n; i++) {
            this.insere(vetor[i], vetor, i, Order.DESC);
        }
    }

    private void getVetor(int[] vetor) {
        String resultado = "[ ";

        for (int i = 0; i < vetor.length; i++)  {
            if (i == 0) {
                resultado += vetor[i];
                continue;
            }

            resultado += ", " + vetor[i];
        }

        System.out.println(resultado += " ]");
    }

    private void getVetor(String[] vetor) {
        String resultado = "[ ";

        for (int i = 0; i < vetor.length; i++)  {
            if (i == 0) {
                resultado += vetor[i];
                continue;
            }

            resultado += ", " + vetor[i];
        }

        System.out.println(resultado += " ]");
    }
    public void execute() {
        int[] vetorInt = { 46, 19, 27, 50, 38 };
        insertion_sort(vetorInt, vetorInt.length);
        this.getVetor(vetorInt);

        String[] vetorString = { "Mauricio", "Claudio", "Moacir", "Junior", "Bruna", "Augusto", "José" };
        insertion_sort(vetorString, vetorString.length);
        this.getVetor(vetorString);
    }
}

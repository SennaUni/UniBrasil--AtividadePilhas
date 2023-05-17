package Order;

public class SelectionSort {
    public int selection(double vetor[], int n, Order order) {
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (order == Order.ASC) {
                if (vetor[i] < vetor[j]) i = j;
            } else {
                if (vetor[i] > vetor[j]) i = j;
            }
        }

        return i;
    }

    public int selection(String vetor[], int n, Order order) {
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (order == Order.ASC) {
                if (vetor[i].compareTo(vetor[j]) < 0) i = j;
            } else {
                if (vetor[i].compareTo(vetor[j]) > 0) i = j;
            }
        }

        return i;
    }
    public void selectionSort(double[] vetor, Order order) {
        int n = vetor.length;
        double temp;
        int i;

        while (n > 1) {
            i = selection(vetor, n, order);
            temp = vetor[n - 1];
            vetor[n - 1] = vetor[i];
            vetor[i] = temp;
            n--;
        }
    }
    public void selectionSort(String[] vetor, Order order) {
        int n = vetor.length;
        String temp;
        int i;

        while (n > 1) {
            i = selection(vetor, n, order);
            temp = vetor[n - 1];
            vetor[n - 1] = vetor[i];
            vetor[i] = temp;
            n--;
        }
    }
    public void getVetorString(double[] vetor) {
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

    public void getVetorString(String[] vetor) {
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
        double[] vetorDouble = { 45, 10, 26, 89, 126, 14, 2, 63, 74, 15, 59 };
        System.out.println("Vetor double inicial:");
        getVetorString(vetorDouble);
        selectionSort(vetorDouble, Order.DESC);
        System.out.println("Vetor double ordenado:");
        getVetorString(vetorDouble);

        String[] vetorString = { "Mauricio", "Claudio", "Moacir", "Junior", "Bruna", "Augusto", "José" };
        System.out.println("Vetor string inicial:");
        getVetorString(vetorString);
        selectionSort(vetorString, Order.DESC);
        System.out.println("Vetor string ordenado:");
        getVetorString(vetorString);
    }
}

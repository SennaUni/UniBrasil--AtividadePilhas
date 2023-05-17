package Order;

public class BubbleSort {
    public void bubbleSort(double[] vetor, Order order) {
        int n = vetor.length;
        double temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (order == Order.ASC) {
                    if (vetor[j] > vetor[j + 1]) {
                        temp = vetor[j + 1];
                        vetor[j + 1] = vetor[j];
                        vetor[j] = temp;
                    }
                } else {
                    if (vetor[j] < vetor[j + 1]) {
                        temp = vetor[j + 1];
                        vetor[j + 1] = vetor[j];
                        vetor[j] = temp;
                    }
                }
            }
        }
    }
    public void bubbleSort(String[] vetor, Order order) {
        int n = vetor.length;
        String temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (order == Order.ASC) {
                    if (vetor[j].compareTo(vetor[j + 1]) > 0) {
                        temp = vetor[j + 1];
                        vetor[j + 1] = vetor[j];
                        vetor[j] = temp;
                    }
                } else {
                    if (vetor[j].compareTo(vetor[j + 1]) < 0) {
                        temp = vetor[j + 1];
                        vetor[j + 1] = vetor[j];
                        vetor[j] = temp;
                    }
                }
            }
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
        bubbleSort(vetorDouble, Order.ASC);
        System.out.println("Vetor double ordenado:");
        getVetorString(vetorDouble);

        String[] vetorString = { "Mauricio", "Claudio", "Moacir", "Junior", "Bruna", "Augusto", "José" };
        System.out.println("Vetor string inicial:");
        getVetorString(vetorString);
        bubbleSort(vetorString, Order.ASC);
        System.out.println("Vetor string ordenado:");
        getVetorString(vetorString);
    }
}


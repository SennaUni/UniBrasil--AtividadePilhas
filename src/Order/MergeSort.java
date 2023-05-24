package Order;

public class MergeSort {
    private void intercala(int vetor[], int primeiro, int meio, int ultimo, Order order) {
        int w[] = new int[ultimo - primeiro + 1];
        int i = primeiro;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= ultimo) {
            if (order == Order.ASC) {
                if (vetor[i] < vetor[j]) {
                    w[k] = vetor[i];
                    i++;
                } else {
                    w[k] = vetor[j];
                    j++;
                }
            } else {
                if (vetor[i] > vetor[j]) {
                    w[k] = vetor[i];
                    i++;
                } else {
                    w[k] = vetor[j];
                    j++;
                }
            }
            k++;
        }

        while (i <= meio) {
            w[k] = vetor[i];
            k++;
            i++;
        }

        while (j <= ultimo) {
            w[k] = vetor[j];
            k++;
            j++;
        }

        for (k = 0; k <= ultimo - primeiro; k++) {
            vetor[primeiro + k] = w[k];
        }
    }

    private void intercala(String vetor[], int primeiro, int meio, int ultimo, Order order) {
        String w[] = new String[ultimo - primeiro + 1];
        int i = primeiro;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= ultimo) {
            if (order == Order.ASC) {
                if (vetor[i].compareTo(vetor[j]) < 0) {
                    w[k] = vetor[i];
                    i++;
                } else {
                    w[k] = vetor[j];
                    j++;
                }
            } else {
                if (vetor[i].compareTo(vetor[j]) > 0) {
                    w[k] = vetor[i];
                    i++;
                } else {
                    w[k] = vetor[j];
                    j++;
                }
            }
            k++;
        }

        while (i <= meio) {
            w[k] = vetor[i];
            k++;
            i++;
        }

        while (j <= ultimo) {
            w[k] = vetor[j];
            k++;
            j++;
        }

        for (k = 0; k <= ultimo - primeiro; k++) {
            vetor[primeiro + k] = w[k];
        }
    }

    private void merge_sort(int vetor[], int primeiro, int ultimo, Order order) {
        if (primeiro != ultimo) {
            int meio = (primeiro + ultimo) / 2;

            this.merge_sort(vetor, primeiro, meio, order);
            this.merge_sort(vetor, meio + 1, ultimo, order);

            this.intercala(vetor, primeiro, meio, ultimo, order);
        }
    }

    private void merge_sort(String vetor[], int primeiro, int ultimo, Order order) {
        if (primeiro != ultimo) {
            int meio = (primeiro + ultimo) / 2;

            this.merge_sort(vetor, primeiro, meio, order);
            this.merge_sort(vetor, meio + 1, ultimo, order);

            this.intercala(vetor, primeiro, meio, ultimo, order);
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
        int[] vetorInt = { 46, 19, 27, 50, 38, 15, 78, 65, 23, 47, 59, 19, 46, 73, 28 };
        this.merge_sort(vetorInt, 0, vetorInt.length - 1, Order.DESC);
        this.getVetor(vetorInt);

        String[] vetorString = { "Mauricio", "Claudio", "Moacir", "Junior", "Bruna", "Augusto", "José" };
        this.merge_sort(vetorString,0, vetorString.length - 1, Order.ASC);
        this.getVetor(vetorString);
    }
}

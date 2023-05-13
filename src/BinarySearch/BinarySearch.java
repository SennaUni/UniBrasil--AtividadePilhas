package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int chave, int vetor[]) {
        int tamanhoArray = vetor.length;
        int primeiro = 0;
        int ultimo = tamanhoArray - 1;
        int m = 0;

        while (primeiro <= ultimo) {
            m = (primeiro + ultimo) / 2;

            if (chave == vetor[m]) {
                return 1;
            } else {
                if (chave < vetor[m]) {
                    ultimo = m - 1;
                } else {
                    primeiro = m + 1;
                }
            }
        }

        return 0;
    }

    public static int binarySearchReturnKey(int chave, int vetor[]) {
        int tamanhoArray = vetor.length;
        int primeiro = 0;
        int ultimo = tamanhoArray - 1;
        int meio = 0;

        while (primeiro <= ultimo) {
            meio = (primeiro + ultimo) / 2;

            if (chave == vetor[meio]) {
                return meio;
            } else {
                if (chave < vetor[meio]) {
                    ultimo = meio - 1;
                } else {
                    primeiro = meio + 1;
                }
            }
        }

        return 0;
    }

    public static int binarySearch(String chave, String vetor[]) {
        int tamanhoArray = vetor.length;
        int primeiro = 0;
        int ultimo = tamanhoArray - 1;
        int meio = 0;

        while (primeiro <= ultimo) {
            meio = (primeiro + ultimo) / 2;

            if (chave.equals(vetor[meio])) {
                return 1;
            } else {
                if (chave.compareTo(vetor[meio]) < 0) {
                    ultimo = meio - 1;
                } else {
                    primeiro = meio + 1;
                }
            }
        }

        return 0;
    }

    public static int binarySearchReturnKey(String chave, String vetor[]) {
        int tamanhoArray = vetor.length;
        int primeiro = 0;
        int ultimo = tamanhoArray - 1;
        int meio = 0;

        while (primeiro <= ultimo) {
            meio = (primeiro + ultimo) / 2;

            if (chave.equals(vetor[meio])) {
                return meio;
            } else {
                if (chave.compareTo(vetor[meio]) < 0) {
                    ultimo = meio - 1;
                } else {
                    primeiro = meio + 1;
                }
            }
        }

        return 0;
    }
    public void execute() {
        int[] vetorInt = { 15, 22, 46, 71, 120, 125, 171, 201, 367, 1243 };
        int chaveInt;

        String[] vetorStr = { "Ana", "Bruno", "Gabriel", "Mauricio", "Vinicius" };
        String chaveStr;

        int resultado;

        chaveInt = 367;
        System.out.println("Teste 1 de Busca Binária");
        System.out.println("Buscando a chave: " + chaveInt);
        resultado = binarySearch(chaveInt, vetorInt);
        System.out.println("Resulado da busca: " + resultado);

        chaveInt = 367;
        System.out.println("Teste 2 de Busca Binária");
        System.out.println("Buscando a chave: " + chaveInt);
        resultado = binarySearchReturnKey(chaveInt, vetorInt);
        System.out.println("Resulado da busca: " + resultado);

        chaveStr = "Mauricio";
        System.out.println("Teste 3 de Busca Binária");
        System.out.println("Buscando a chave: " + chaveStr);
        resultado = binarySearch(chaveStr, vetorStr);
        System.out.println("Resulado da busca: " + resultado);

        chaveStr = "Gabriel";
        System.out.println("Teste 3 de Busca Binária");
        System.out.println("Buscando a chave: " + chaveStr);
        resultado = binarySearchReturnKey(chaveStr, vetorStr);
        System.out.println("Resulado da busca: " + resultado);
    }
}

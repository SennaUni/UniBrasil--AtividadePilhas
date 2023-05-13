package LinearSearch;

public class LinearSearch {
    public LinearSearch(){
        super();
    }

    public int buscaSequencialFor(int chave, int v[]){
        int n = v.length;

        for (int i= 0; i < n; i++)
            if (chave == v[i]) return i;
        return -1;
    }

    public int buscaSequencialWhile(int chave, int v[]){
        int n = v.length;
        int i = 0;

        while (i < n) {
            if (chave == v[i]) return i;
            i++;
        }

        return -1;
    }

    public int buscaSequencialString(String chave, String v[]){
        int n = v.length;

        for (int i= 0; i < n; i++)
            if (chave == v[i]) return i;
        return -1;
    }

    public void execute(){
        String[] vetorStr = { "Pedro", "Mauricio", "Ricardo" };
        String chaveStr;

        int[] vetorInt = { 10, 2, 5, 8, 7, 40, 12 };
        int chaveInt;

        int result;

        chaveInt = 5;
        System.out.println("Teste 1 - buscando a chave: " + chaveInt);
        result = buscaSequencialFor(chaveInt, vetorInt);
        System.out.println("Resultado da busca: "+ result);

        chaveInt = 12;
        System.out.println("Teste 2 - buscando a chave: " + chaveInt);
        result = buscaSequencialWhile(chaveInt, vetorInt);
        System.out.println("Resultado da busca: "+ result);

        chaveStr = "Mauricio";
        System.out.println("Teste 2 - buscando a chave: " + chaveStr);
        result = buscaSequencialString(chaveStr, vetorStr);
        System.out.println("Resultado da busca: "+ result);
    }
}

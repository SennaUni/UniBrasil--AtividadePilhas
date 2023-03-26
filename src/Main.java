public class Main {
    public static void main(String[] args) {
        try {
            TesteStack teste = new TesteStack();
            teste.execute();
        } catch (ExceptionCustomizada e) {
            System.out.println(e.getMessage());
        }
    }
}
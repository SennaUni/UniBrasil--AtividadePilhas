public class ExceptionCustomizada extends ArrayIndexOutOfBoundsException {
    @Override
    public String getMessage(){
        return "A LISTA ESTÁ VAZIA! ESTA OPERAÇÃO NÃO PODE SER EXECUTADA";
    }
}

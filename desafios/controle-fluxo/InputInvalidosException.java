public class InputInvalidosException extends RuntimeException {
    public InputInvalidosException(){
        super("O valor do segundo parâmetro deve ser maior que o primeiro");
    }
}
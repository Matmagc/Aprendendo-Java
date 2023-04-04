
public class DivisaoNaoExataException extends Exception{

    public DivisaoNaoExataException(String message, int numerado, int denominador) {
        super(message);
    }
}
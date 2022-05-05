package exceptions;
public class AutorInvalidoException extends Exception{

    private String mensagem;

    public AutorInvalidoException(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String toString() {
        return mensagem;
    }
}
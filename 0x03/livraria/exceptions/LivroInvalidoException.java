public class LivroInvalidoException extends Exception{

    private String mensagem;

    public LivroInvalidoException(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String toString() {
        return mensagem;
    }
}
}

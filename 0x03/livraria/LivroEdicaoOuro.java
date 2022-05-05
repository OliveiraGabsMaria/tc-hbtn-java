import exceptions.LivroInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro{

    public LivroEdicaoOuro(String titulo, String autor, String preco) throws LivroInvalidoException, AutorInvalidoException {
        super(titulo, autor, preco);
    }

    public LivroEdicaoOuro(){

    }

    public double getPreco() {
        return (super.getPreco() * 0.3) + super.getPreco();
    }
}

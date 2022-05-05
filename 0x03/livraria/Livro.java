import exceptions.*;

import java.util.StringTokenizer;
public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, String preco) throws LivroInvalidoException, AutorInvalidoException {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setPreco(preco);
        this.autor = livro.getAutor();
        this.titulo = livro.getTitulo();
        this.preco = livro.getPreco();
    }
    public Livro(){
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException{
        if(titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException{
        if(new StringTokenizer(autor).countTokens() <2) {
            throw new AutorInvalidoException("Nome do autor invalido");
        }
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException{
        if(preco < 1){
            throw new LivroInvalidoException("Preco de livro invalido");;
        }
        this.preco = preco;
    }
}

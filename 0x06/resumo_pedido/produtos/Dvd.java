package produtos;

public class Dvd extends Produto{
    private String diretor;
    private String genero;
    private int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao){
        super(titulo, ano, pais, precoBruto);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public double obterPrecoLiquido(){
        return this.precoBruto + this.precoBruto * 0.20;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }
}

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkUp;

    public Supplier<Double> precoComMarkUp = () -> this.preco * this.percentualMarkUp/100;
    public Consumer<Double> atualizarMarkup = (Double newPercentualMarkUp) -> this.percentualMarkUp = newPercentualMarkUp;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkUp = 10.0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

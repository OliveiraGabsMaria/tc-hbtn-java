import java.util.List;
import java.util.stream.Collectors;
public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        return pedido.getProdutos()
                .stream()
                .filter(produto -> produto.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        List<Produto> filtered = produtos
                .stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .collect(Collectors.toList());

        return filtered == null ? null : filtered.get(0);
    }

}

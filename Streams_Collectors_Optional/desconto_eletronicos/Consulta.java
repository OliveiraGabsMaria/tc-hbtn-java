import java.util.Comparator;
import java.util.*;
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

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        return produtos
                .stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos){
        return pedidos
                .stream()
                .filter(pedido -> pedido.getProdutos().stream().anyMatch(produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO))
                .collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos){
        return produtos.stream()
                .map(produto -> {
                    if(produto.getCategoria() == CategoriaProduto.ELETRONICO){
                        produto.setPreco(produto.getPreco() - produto.getPreco()*0.15);
                    }
                    return produto;
                })
                .collect(Collectors.toList());
    }

}

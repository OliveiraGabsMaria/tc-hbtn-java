import produtos.Produto;
import produtos.Livro;
import produtos.Dvd;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens){
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double total = 0;

        for(ItemPedido item : itens){
            total += item.getQuantidade()*(item.getProduto().obterPrecoLiquido());
        }

        return total - total * this.percentualDesconto / 100;
    }

    public void apresentarResumoPedido(){
        double total = 0;
        double desconto = 0;

        System.out.println("------- RESUMO PEDIDO -------");

        for(ItemPedido item: itens){
            Produto produto = item.getProduto;

            if (produto instanceof Livro) {
                System.out.printf("Tipo: Livro ");
            }
            else if (produto instanceof Dvd) {
                System.out.printf("Tipo: Dvd ");
            }
            System.out.printf("Titulo: " + produto.getTItulo() + " ");
            System.out.printf("Preco: " + String.format("%.2f" , produto.obterPrecoLiquido()) + " ");
            System.out.printf("Quant: " + item.getQuantidade() + " ");
            System.out.printf("Total: " + String.format("%.2f", produto.obterPrecoLiquido() * item.getQuantidade()) + "/n");

            total += produto.obterPrecoLiquido() * item.getQuantidade();
        }

        desconto = this.percentualDesconto * total/100;


        System.out.println("----------------------------");
        System.out.printf("DESCONTO: " + String.format("%.2f", desconto));
        System.out.printf("\nTOTAL PRODUTOS: " + String.format("%.2f", total));
        System.out.println("\n----------------------------");
        System.out.printf("TOTAL PEDIDO: " + String.format("%.2f", total - desconto));
        System.out.println("\n----------------------------");
    }
}

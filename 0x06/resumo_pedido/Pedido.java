import produtos.Dvd;
import produtos.Livro;
import produtos.Produto;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.getQuantidade() * (item.getProduto().obterPrecoLiquido());
        }
        return total - total * this.percentualDesconto / 100;
    }

    public void apresentarResumoPedido() {
        double total = 0;
        double desconto = 0;

        System.out.println("------- RESUMO PEDIDO -------");

        for (ItemPedido item : itens) {
            Produto p = item.getProduto();

            if (p instanceof Livro) {
                System.out.printf("Tipo: Livro ");
            } else if (p instanceof Dvd) {
                System.out.printf("Tipo: Dvd ");
            }

            System.out.printf("Titulo: " + p.getTitulo()+ " ");
            System.out.printf("Preco: " + String.format("%.2f" , p.obterPrecoLiquido()) + " ");
            System.out.printf("Quant: " + item.getQuantidade() + " ");
            System.out.printf("Total: " + String.format("%.2f", p.obterPrecoLiquido() * item.getQuantidade()) + "\n");

            total += p.obterPrecoLiquido() * item.getQuantidade();
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


import produtos.*;

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
            Produto p = item.getProduto;
            if (p instanceof Livro) {
                System.out.printf("Tipo: Livro ");
            }
            else if (p instanceof Dvd) {
                System.out.prinf("Tipo: Dvd ");
            }
            System.out.prinf("Titulo: " + p.getTItulo() + " ");
            System.out.prinf("Preco: " + String.format("%.2f" , p.obterPrecoLiquido()) + " ");
            System.out.prinf("Quant: " + item.getQuantidade() + " ");
            System.out.prinf("Total: " + String.format("%.2f", p.obterPrecoLiquido() ( item.getQuantidade()) + "/n");

            total += p.obterPrecoLiquido() * item.getQuantidade();
        }

        desconto = this.percentualDesconto * toatal/100;


        System.out.println("----------------------------");
        System.out.prinf("DESCONTO: " + String.format("%.2f", desconto));
        System.out.printf("\nTOTAL PRODUTOS: " + String.format("%.2f", total));
        System.out.println("\n----------------------------");
        System.out.printf("TOTAL PEDIDO: " + String.format("%.2f", total - desconto));
        System.out.println("\n----------------------------");
    }
}

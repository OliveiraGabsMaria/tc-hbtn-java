import provedores.*;

public class ProcessadorPedido {

    public ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido){
        pedido.frete = this.provedorFrete.calcularFrete(pedido.peso, pedido.total);
    }
}

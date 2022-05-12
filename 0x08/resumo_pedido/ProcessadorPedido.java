import provedores.*;

public class ProcessadorPedido {

    ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido){
        pedido.frete = this.provedorFrete.calcularFrete(pedido.peso, pedido.total);
    }
}

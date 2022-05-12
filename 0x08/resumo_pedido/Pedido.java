import provedores.Frete;

public class Pedido {

     int codigo;
     double peso;
     double total;
     Frete frete;

    public Pedido(int codigo, double peso, double total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

    public Frete getFrete() {
        return this.frete;
    }
}
 
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido () {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie( PedidoCookie pedidoCookie){
        this.cookies.add(cookies);
    }

    public int obterTotalCaixas(){
        int total = 0;
        for (PedidoCookie cookie : this.cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor){
        int total = 0;
        for (int i = 0; i < this.cookies.siz(); i++){
            if (this.cookies.get(i).getSabor().equals(sabor)){
                total += this.cookies.get(i).getQuantidadeCaixas();
                this.cookies.remove(i);
            }
        }
        return total;
    }

}

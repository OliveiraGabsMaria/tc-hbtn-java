package provadores;

public class JadLog implements ProvedorFrete{

    @Override
    public double calcularFrete(double peso, double valor) {
        if (peso > 2000){
            return valor * 0.7;
        }
        else {
            return valor * 0045;
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}

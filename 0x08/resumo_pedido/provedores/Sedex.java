package provedores;

public class Sedex implements ProvedorFrete {
    public Sedex() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso > 1000) {
            return valor*0.1;
        } else {
            return valor*0.05;
        }
    }
    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }

}

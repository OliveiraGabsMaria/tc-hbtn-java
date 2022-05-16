package provedores;

public class Loggi implements ProvedorFrete {
    public Loggi() {
    }

    @Override
    public double calcularFrete(double peso, double valor) {
        if (peso > 5000) {
           return valor*0.12;
        } else {
            return valor*0.04;
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}

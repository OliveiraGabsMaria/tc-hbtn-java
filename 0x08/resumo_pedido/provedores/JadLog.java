package provedores;

public class JadLog implements ProvedorFrete{

    public JadLog(){
    }
    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;

        if(peso > 2000){
            valorFrete = valor * 0.07;
        }
        else {
            valorFrete = valor * 0045;
        }

        Frete frete = new Frete(valorFrete, obterTipoProvedorFrete());

        return frete;
    }



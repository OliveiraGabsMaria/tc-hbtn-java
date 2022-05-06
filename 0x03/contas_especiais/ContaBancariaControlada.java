public class ContaBancariaControlada extends ContaBancariaBasica{

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade){
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal(){
        double saldo = this.getSaldo();

        saldo += - calcularTarifaMensal() + saldo * (calcularJurosMensal()/100);

        if (saldo < this.saldoMinimo || saldo == 0) {
           saldo += - this.valorPenalidade;
        }

        this.setSaldo(saldo);
    }
}

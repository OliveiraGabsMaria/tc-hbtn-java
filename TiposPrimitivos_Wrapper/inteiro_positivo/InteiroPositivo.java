public class InteiroPositivo {

    private int valor;

    public InteiroPositivo(int valor) throws IllegalArgumentException{
        this.setValor(valor);
    }

    public InteiroPositivo(String valor) throws IllegalArgumentException{
        this.setValor(Integer.parseInt(valor));
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws IllegalArgumentException{
        if (valor < 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        else{
            this.valor = valor;
        }
    }

    public boolean ehPrimo(){
        if (valor <= 1){
            return false;
        } else if (valor == 2 || valor == 3) {
            return true;
        } else if (valor % 2 == 0 || valor % 3 == 0) {
            return false;
        } else {
            return true;
        }
    }
}

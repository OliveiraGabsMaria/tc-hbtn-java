public class Telefone {
    private final String codigoArea;
    private final String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + codigoArea + ") " + numero;
    }
}

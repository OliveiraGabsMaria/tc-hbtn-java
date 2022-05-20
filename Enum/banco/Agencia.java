import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String nomeCliente) {
        for (int i = 0; i < clientes.size(); i++){
            if (clientes.get(i).getNome().equals(nomeCliente)){
                return clientes.get(i);
            }
        }
        return null;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacaoInicial){
        Cliente clienteLocalizado = buscarCliente(nomeCliente);
        if (clienteLocalizado == null){
            return false;
        }

        clienteLocalizado.adicionarTransacao(valorTransacaoInicial);
        return true;
    }

    public boolean novoCliente(String nomeCliente, double valorTransacaoInicial){
        Cliente clienteLocalizado = buscarCliente(nomeCliente);
        if (clienteLocalizado != null) {
            return false;
        }

        Cliente novoCliente = new Cliente(nomeCliente, valorTransacaoInicial);
        clientes.add(novoCliente);
        return true;
    }
}

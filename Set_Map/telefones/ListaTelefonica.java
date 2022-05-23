import java.util.ArrayList;
import java.util.HashMap;
public class ListaTelefonica {
    private final HashMap<String, ArrayList<Telefone>> listaTelefones;

    public ListaTelefonica(){
        this.listaTelefones = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> listaTelefone = new ArrayList<Telefone>();

        listaTelefone.add(telefone);

        if (this.listaTelefones.containsKey(nome)) {
            this.listaTelefones.get(nome).add(telefone);
        }
        else {
            this.listaTelefones.put(nome, listaTelefone);
        }
    }

    public ArrayList<Telefone> buscar(String nome) {
        if (this.listaTelefones.containsKey(nome)) {
            return listaTelefones.get(nome);
        }
        else {
            return null;
        }
    }
}

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
public class ListaTelefonica {
    private final HashMap<String, HashSet<Telefone>> listaTelefones;

    public ListaTelefonica(){
        this.listaTelefones = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> listaTelefone = new HashSet<Telefone>();

        for (Map.Entry<String, HashSet<Telefone>> set : this.listaTelefones.entrySet()){
            if (set.getValue().contains(telefone) && set.getKey().equals(nome)){
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            } else if (set.getValue().contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        }

        if (this.listaTelefones.containsKey(nome)) {
            this.listaTelefones.get(nome).add(telefone);
        }
        else {
            listaTelefone.add(telefone);
            this.listaTelefones.put(nome, listaTelefone);
        }
        return this.listaTelefones.get(nome);
    }

    public HashSet<Telefone> buscar(String nome) {
        if (this.listaTelefones.containsKey(nome)) {
            return listaTelefones.get(nome);
        }
        else {
            return null;
        }
    }
}

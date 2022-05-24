import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<E> biblioteca;

    public Biblioteca(){
        this.biblioteca = new ArrayList<E>();
    }

    public void adicionarMidia(E midia){
        this.biblioteca.add(midia);
    }

    public List<E> obterListaMidias(){
        return this.biblioteca;
    }
}

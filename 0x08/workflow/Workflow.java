import atividades.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Workflow {

    public List<Atividade> atividades;

    public Workflow(){
        this.atividades = new ArrayList<Atividade>();
    }

    public void registrarAtividade(Atividade atividade){
        this.atividades.add(atividade);
    }
}

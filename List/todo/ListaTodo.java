import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas= new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        for (Tarefa value : tarefas) {
            if (value.getIdentificador() == tarefa.getIdentificador()){
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
            }
            tarefa.modificarDescricao(tarefa.getDescricao());
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador){
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador){
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador){
                tarefa.setEstahFeita((false));
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas(){
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for (Tarefa tarefa : tarefas){
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for (Tarefa tarefa : tarefas){
            if (tarefa.isEstahFeita()){
                System.out.printf("[X]  Id: %d - Descricao: %s\n", tarefa.getIdentificador(), tarefa.getDescricao());
            }
            else {
                System.out.printf("[ ]  Id: %d - Descricao: %s\n", tarefa.getIdentificador(), tarefa.getDescricao());
            }
        }
    }
}
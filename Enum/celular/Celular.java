import java.util.ArrayList;
import java.util.List;


public class Celular {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    private ArrayList<Contato> contatosListados = new ArrayList<Contato>();

    public Celular(){

    }

    public Celular(ArrayList<Contato> contatos){
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contatoAdd){
        for (Contato contatoAdicionar : contatos){
            if (contatoAdicionar.getNome().equals(contatoAdd.getNome())){
                throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
            }
        }
       contatos.add(contatoAdd);
    }

    public void removerContato(Contato contato) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(contato.getNome())){
                contatos.remove(i);
            }
            else {
                throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
            }
        }
    }

    public void listarContatos() {
        for (Contato contato :  contatos) {
            System.out.println(contato.getNome() + " -> " + contato.getNumero() + " (" + contato.getTipo() + ")");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        for (Contato contato : contatos){
            if (contato.getNome().equals(novoContato.getNome()) && !contato.getNome().equals(contatoAntigo.getNome())){
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            } else if (!(contatoAntigo.getNome().equals(novoContato.getNome()))) {
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
            }
        }

        for (int i = 0; i < contatos.size(); i++){
            if (contatos.get(i).getNome().equals(contatoAntigo.getNome())) {
                contatos.get(i).setNumero(novoContato.getNumero());
                contatos.get(i).setTipo(novoContato.getTipo());
            }
        }
    }

    public List<Contato> obterPosicaoContato (String nomeContatosListados){
        for (Contato contato : contatos){
            if (contato.getNome().equals(nomeContatosListados)){
                contatosListados.add(contato);
            }

        }
        return contatosListados;
    }


}

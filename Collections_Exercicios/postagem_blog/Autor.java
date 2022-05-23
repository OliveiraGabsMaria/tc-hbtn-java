public class Autor implements Comparable<Autor>{

    private String nome;
    private String sobrenome;

    public Autor() {

    }

    public Autor(String nome, String sobrenome) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return this.nome + " " + this.sobrenome;
    }

    @Override
    public int compareTo(Autor autor) {
        return this.toString().compareTo(autor.toString());
    }

    public boolean equals(Object object){
        if (this == object) {
            return true;
        }
        if (!(object instanceof Autor)){
            return false;
        }

        if (!super.equals(object)){
            return false;
        }

        Autor autor = (Autor) object;

        if (!getNome().equals(autor.getNome())){
            return false;
        }
        if(!sobrenome.equals(autor.sobrenome)){
            return false;
        }

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getNome().hashCode();
        result = 31 * result + sobrenome.hashCode();
        return result;
    }
}

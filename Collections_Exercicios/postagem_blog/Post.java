public class Post implements  Comparable<Post>{
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    @Override
    public String toString(){
        return this.titulo;
    }

    @Override
    public int compareTo(Post outroPost) {
        return this.toString().compareTo(outroPost.toString());
    }

    public boolean equals(Object object) {
        if (this == object){
            return true;}
        if (!(object instanceof  Post)){
            return false;}
        if (!super.equals(object)){
            return false;}

        Post post = (Post) object;

        if (!getAutor().equals(post.getAutor())) {
            return false;
        }
        if (!getTitulo().equals(post.getTitulo())){
            return false;
        }
        if (!corpo.equals(post.corpo)) {
            return false;
        }
        if (!getCategoria().equals(post.getCategoria())){
            return false;
        }

        return true;
    }

    public int hashCode() {
        int result = autor != null ? autor.hashCode() : 0;
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + (corpo != null ? corpo.hashCode() : 0);
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);

        return result;
    }
}

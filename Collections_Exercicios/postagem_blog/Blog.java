import java.util.*;

public class Blog {
    private final List<Post> posts = new ArrayList<>();

    public Blog() {
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();

        Autor autor = "";
        for (Post post:
             this.posts) {

            autor = post.getAutor();
            autores.add(autor);
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> mapaCategorias = new TreeMap<Categorias, Integer>();

        int total = 0;

        for (int i = 0; i < posts.size(); i++) {
            for (int j = 0; j < posts.size(); j++){
                if (posts.get(i).getCategoria().equals(posts.get(j).getCategoria())) {
                    total++;
                }
            }
            mapaCategorias.put(posts.get(i).getCategoria(), total);
        }
        return mapaCategorias;
    }

    public void adicionarPostagem(Post postagem) {
        for (Post post : posts) {
            if (post.getAutor().equals(postagem.getAutor()) && post.getTitulo().contains(postagem.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        posts.add(postagem);
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postAutor = new TreeSet<>();
        posts.sort(Comparator.comparing(Post::getTitulo));

        for (Post post:
             this.posts) {
             autor = post.getAutor();
            if (autor.equals(autor)) {
                postAutor.add(post);
            }
        }
        return postAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> categoriasPost = new TreeSet<>();
        posts.sort(Comparator.comparing(Post::getTitulo));

        for(Post post:posts){
            if (post.getCategoria().equals(categoria)) {
                categoriasPost.add(post);
            }
        }
        return categoriasPost;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> todosPosts = new TreeMap<>();

        for (Post post : posts) {
            Set<Post> postagem;
            if (todosPosts.containsKey(post.getCategoria())){
                postagem = todosPosts.get(post.getCategoria());
            }
            else {
                postagem = new TreeSet<>();
            }

            postagem.add(post);
            todosPosts.put(post.getCategoria(), postagem);
        }
        return todosPosts;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosPots = new TreeMap<>();

        for (Post post : posts){
            Set<Post> postagem;
            if (todosPots.containsKey(post.getAutor())) {
                postagem = todosPots.get(post.getAutor());
            }
            else {
                postagem = new TreeSet<>();
            }

            postagem.add(post);
            todosPots.put(post.getAutor(), postagem);
        }

        return todosPots;
    }

}
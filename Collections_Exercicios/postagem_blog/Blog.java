import java.util.*;

public class Blog {
    private List<Post> posts);

    public Blog() {
        this.posts = new ArrayList<Post>();
    }


    public void adicionarPostagem(Post postagem) throws  IllegalArgumentException{
        for (Post post : posts) {
            if (post.getAutor().equals(postagem.getAutor()) && post.getTitulo().contains(postagem.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        posts.add(postagem);
    }
    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();

        Collections.sort(this.posts);
        this.posts.forEach(post -> autores.add(post.getAutor()));

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
            total = 0;
        }
        return mapaCategorias;
    }


    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> posts = new TreeSet<Post>();

        this.posts.forEach(post -> {
            if (post.getAutor().toString().equals(autor.toString()))
                post.add(post);
        });
        return posts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> posts = new TreeSet<Post>();
        this.posts.forEach(post -> {
            if (post.getCategoria().equals(categoria))
                post.add(post);
        });

        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> todosPosts = new TreeMap<Categorias, Set<Post>>();

        this.posts.forEach(post -> {
            todosPosts.compute(post.getCategoria(), (key, value) -> {
                return obterPostsPorCategoria(key);
            });
        });
        return todosPosts;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosPots = new LinkedHashMap<Autor, Set<Post>>();

      obterTodosAutores().forEach(autor -> {
          todosPots.compute(autor, (key, value) ->{
              return obterPostsPorAutor(key);
          });
      });

        return todosPots;
    }

}
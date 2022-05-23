import java.util.*;

public class Blog {
    private List<Post> posts = new ArrayList<>();

    public void adicionarPostagem(Post post) {
        posts.add(post);
    }

    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<>();
        for (Post post : posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> map = new TreeMap<>();
        for (Post post : posts) {
            if (map.containsKey(post.getCategoria())) {
                map.put(post.getCategoria(), map.get(post.getCategoria()) +v1);
            }
            else {
                map.put(post.categoria, 1);
            }
        }

        return map;
    }
}

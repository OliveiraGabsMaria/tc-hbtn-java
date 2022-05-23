import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase){
        frase = frase.toLowerCase();
        TreeMap<String, Integer> map = new TreeMap<>();

        frase = frase.replaceAll("[?.!]*", "");

        String[] listaDePalavras = (frase.split(" "));

        for (int i = 0; i < listaDePalavras.length; i++) {
            if (map.containsKey(listaDePalavras[i])) {
                map.put(listaDePalavras[i], map.get(listaDePalavras[i]) + 1);
            }
            else {
                map.put(listaDePalavras[i], 1);
            }
        }
        return map;
    }
}

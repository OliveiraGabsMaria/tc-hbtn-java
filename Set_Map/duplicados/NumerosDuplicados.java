import java.util.*;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] numeros){
        TreeSet<Integer> setMap = new TreeSet<>();
        Set<Integer> set = new HashSet<>();
        for (int numero : numeros) {
            if (set.contains(numero)){
                setMap.add(numero);
            }
            else {
                set.add(numero);
            }
        }

        return setMap;
    }
}

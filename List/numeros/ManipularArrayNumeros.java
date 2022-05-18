import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero (List<Integer> numeros, int i){
        for (int j = 0; j < numeros.size(); j++){
            if (numeros.get(j) == i){
                return j;
            }
        }
        return -1;
    }

    public static void adicionarNumero (List<Integer> numeros, int i){
        if (buscarPosicaoNumero(numeros, i) != -1){
            throw new IllegalArgumentException("Numero jah contido na lista");
        } else {
            numeros.add(i);
        }
    }

    public static void removerNumero (List<Integer> numeros, int i){
        if (buscarPosicaoNumero(numeros, i) == 1){
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
        else {
            numeros.remove(buscarPosicaoNumero(numeros, i));
        }
    }

    public static void substituirNumero (List<Integer> numeros, int numeroSubstituir, int numeroSubstituto){
        if (buscarPosicaoNumero(numeros, numeroSubstituir) == -1){
            numeros.add(numeroSubstituto);
        }
        else {
            numeros.set(buscarPosicaoNumero(numeros, numeroSubstituir), numeroSubstituto);
        }
    }
}

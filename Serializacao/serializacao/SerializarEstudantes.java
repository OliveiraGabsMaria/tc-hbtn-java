import java.io.*;
import java.util.List;

public class SerializarEstudantes<T> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(this.nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(estudantes);
        }catch (Exception e){
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<T> desserializar(){
        FileInputStream fis = null;
        FileInputStream ois = null;

        try {
            fis = new FileInputStream(this.nomeArquivo);
            ois = new FileInputStream(fis);

            @SuppressWarnings("unchecked") List<T> result = (List<T>) ois.readObject();

            return result;
        } catch (Exception e){
            System.out.println("Nao foi possivel desserializar");
        }
    }
}

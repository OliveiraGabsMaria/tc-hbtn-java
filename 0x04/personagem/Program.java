import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        PersonagemGame personagem1 = new PersonagemGame();
        PersonagemGame personagem2 = new PersonagemGame();

        personagem1.nome = "Sonic";
        personagem1.saudeAtual = 10;

        personagem2.nome = "Mario";
        personagem2.saudeAtual = 100;

        System.out.printf("Nome: %s - Saude: %d\n", personagem1.nome, personagem1.saudeAtual);
        System.out.printf("Nome: %s - Saude: %d\n", personagem2.nome, personagem2.saudeAtual);
    }
}

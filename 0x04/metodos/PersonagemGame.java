public class PersonagemGame {

    private int saudeAtual;
    private String nome;

    public PersonagemGame(){
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public void tomarDano(int quantidadeDeDano){
        int novaSaude = this.saudeAtual - quantidadeDeDano;

        if (novaSaude > 0){
            this.saudeAtual = novaSaude;
        }
        else {
            this.saudeAtual = 0;
        }
    }

    public void receberCura(int quantidadeDeCura){
        int novaSaude = this.saudeAtual + quantidadeDeCura;

        if(novaSaude < 100) {
            this.saudeAtual = novaSaude;
        }
        else {
            this.saudeAtual = 100;
        }
    }
}

public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome){
    this,nome = nome;
    this.saudeAtual = saudeAtual;
    setSaudeAtual(saudeAtual);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()){
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setSaudeAtual(int valor) {
        this.saudeAtual = valor;

        if (valor <= 0){
            this.status = "morto";
        }
        else{
            this.status = "vivo";
        }
    }

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano){
        int novaSaude = this.saudeAtual - quantidadeDeDano;

        if (novaSaude > 0){
            setSaudeAtual(novaSaude);
        }
        else {
            setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura){
        int novaSaude = this.saudeAtual + quantidadeDeCura;

        if(novaSaude < 100) {
            setSaudeAtual(novaSaude);
        }
        else {
            setSaudeAtual(100);
        }
    }
}


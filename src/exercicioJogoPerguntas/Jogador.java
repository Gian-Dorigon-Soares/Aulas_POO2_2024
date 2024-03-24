package exercicioJogoPerguntas;

public class Jogador {
    private String nome;
    private int pontos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Jogador() {
        setNome("");
        setPontos(0);
    }

    public Jogador(String nome, int pontos) {
        setNome(nome);
        setPontos(pontos);
    }
}

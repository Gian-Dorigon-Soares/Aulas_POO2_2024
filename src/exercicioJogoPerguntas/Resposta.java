package exercicioJogoPerguntas;

public class Resposta {
    private Pergunta perguntaSelecionada;
    private boolean respostaJogador;
    public String correcao () {
        if(perguntaSelecionada.isResposta()==respostaJogador) {
            return "acerto";
        }
        return "erro";

    }

    public Pergunta getPerguntaSelecionada() {
        return perguntaSelecionada;
    }

    public void setPerguntaSelecionada(Pergunta perguntaSelecionada) {
        this.perguntaSelecionada = perguntaSelecionada;
    }

    public boolean isRespostaJogador() {
        return respostaJogador;
    }

    public void setRespostaJogador(boolean respostaJogador) {
        this.respostaJogador = respostaJogador;
    }

    public Resposta() {
    }

    public Resposta(Pergunta perguntaSelecionada, boolean respostaJogador) {
        this.perguntaSelecionada = perguntaSelecionada;
        this.respostaJogador = respostaJogador;
    }
}

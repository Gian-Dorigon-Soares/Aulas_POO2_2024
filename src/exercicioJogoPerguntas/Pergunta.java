package exercicioJogoPerguntas;

public class Pergunta {
    private String pergunta;
    private boolean resposta;

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public boolean isResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

    public Pergunta() {
    }

    public Pergunta(String pergunta) {
        String [] dados = pergunta.split(",");
        setPergunta(dados[0]);
        setResposta(dados[1].equalsIgnoreCase("verdadeiro"));
    }
}

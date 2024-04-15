package exercicioJogoPerguntas.test;

import exercicioJogoPerguntas.Arquivo;
import exercicioJogoPerguntas.Pergunta;
import exercicioJogoPerguntas.Resposta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArquivoTest {

    private Arquivo jogo = new Arquivo();

    @Test
    void carregarArquivoTest() {
        jogo.lerAquivo();
        assertEquals(20,jogo.getPerguntas().size());
        Pergunta quarta = jogo.getPerguntas().get(3);
        assertEquals("A clorofila é a substância responsável pela cor verde das plantas,verdadeiro", quarta.getPergunta());
        assertEquals(true, quarta.isResposta());
    }

    @Test
    void fazCorrecaoTest() {
        Pergunta pergunta = new Pergunta("ABCD é EFGH,Falso");
        Resposta r = new Resposta(pergunta, false);
        assertEquals("acerto", r.correcao());
    }

}
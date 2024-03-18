package revisao_desafio_jogador.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import revisao_desafio_jogador.Jogador;
<<<<<<< HEAD
=======

>>>>>>> 6beeff9 (11/03/24 finalização da atividade banco e inicio da atividade de ler arquivo)
import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {
    Jogador j1;
    Jogador j2;

    @BeforeEach
    public void setUpJogadores() {
        j1 = new Jogador();
        j2 = new Jogador("A", 5, 3);
    }

    @Test
    public void construtorVazio() {
        assertEquals(0, j1.getCamisa());
        assertEquals(0, j1.getGols());
        assertEquals("", j1.getNome());
        assertEquals("Jogador{" + "nome=" + "" + ", camisa=" + 0 + ", gols=" + 0 + '}',j1.toString());
    }
    @Test
    public void construtorParametrizado() {
        assertEquals(5, j2.getCamisa());
        assertEquals(3, j2.getGols());
        assertEquals("A", j2.getNome());
        assertEquals("Jogador{" + "nome=" + "A" + ", camisa=" + 5 + ", gols=" + 3 + '}',j2.toString());
    }

    @Test
    void setNome() {
    }

    @Test
    void getCamisa() {
    }

    @Test
    void setCamisa() {
    }

    @Test
    void getGols() {
    }

    @Test
    void setGols() {
    }

    @Test
    void testToString() {
    }
}
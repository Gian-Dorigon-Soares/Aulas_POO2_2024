package revisao_desafio_jogador.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import revisao_desafio_jogador.Jogador;
import revisao_desafio_jogador.Time;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    private String nome;
    private ArrayList<Jogador> jogadores;
    private static Time t1;
    private static Time t2;

    @BeforeAll
    public static void inicializar() {
    ArrayList<Jogador> jogadores = new ArrayList<>();
    jogadores.add(new Jogador("N1", 1, 1));
    jogadores.add(new Jogador("N2", 2, 2));
    jogadores.add(new Jogador("N3", 3, 3));
    jogadores.add(new Jogador("N4", 4, 4));
    jogadores.add(new Jogador("N5", 5, 5));
    t1 = new Time("Time 1", jogadores);
    t2 = new Time();
    }

    @org.junit.jupiter.api.Test
    void getNome() {
    }

    @org.junit.jupiter.api.Test
    void setNome() {
    }

    @org.junit.jupiter.api.Test
    void getJogadores() {
    }

    @org.junit.jupiter.api.Test
    void setJogadores() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Time 1 (5)", t1.toString());
        assertEquals(" (0)",t2.toString());
    }

    @org.junit.jupiter.api.Test
    void listaJogadores() {
        String retorno = t1.listaJogadores();
        assertEquals("Jogador{nome=N1, camisa=1, gols=1}\n"+
                "Jogador{nome=N2, camisa=2, gols=2}\n"+
                "Jogador{nome=N3, camisa=3, gols=3}\n"+
                "Jogador{nome=N4, camisa=4, gols=4}\n"+
                "Jogador{nome=N5, camisa=5, gols=5}\n",retorno);
        assertEquals("",t2.listaJogadores());
    }

    @org.junit.jupiter.api.Test
    void artilheiroTime() {
        assertEquals("Jogador{nome=N5, camisa=5, gols=5}",t1.artilheiroTime().toString());
        assertEquals("Jogador{nome=, camisa=0, gols=0}",t2.artilheiroTime().toString());
    }

    @org.junit.jupiter.api.Test
    void golsTime() {
        assertEquals(15, t1.golsTime());
        assertEquals(0, t2.golsTime());
    }
}
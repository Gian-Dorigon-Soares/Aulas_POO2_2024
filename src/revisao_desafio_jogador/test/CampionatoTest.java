package revisao_desafio_jogador.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import revisao_desafio_jogador.Campeonato;
import revisao_desafio_jogador.Jogador;
import revisao_desafio_jogador.Time;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CampionatoTest {
    private static ArrayList<Time> campeonato;

    @BeforeAll
    static void inicializar() {
        ArrayList<Jogador> jogadores1 = new ArrayList<>();
        jogadores1.add(new Jogador("N1", 1, 1));
        jogadores1.add(new Jogador("N2", 2, 2));
        jogadores1.add(new Jogador("N3", 3, 3));
        jogadores1.add(new Jogador("N4", 4, 4));
        jogadores1.add(new Jogador("N5", 5, 5));
        Time t1 = new Time("Time 1", jogadores1);
        ArrayList<Jogador> jogadores2 = new ArrayList<>();
        jogadores2.add(new Jogador("N6", 1, 6));
        jogadores2.add(new Jogador("N7", 2, 7));
        jogadores2.add(new Jogador("N8", 3, 8));
        jogadores2.add(new Jogador("N9", 4, 9));
        jogadores2.add(new Jogador("NA", 5, 10));
        Time t2 = new Time("Time 2", jogadores2);
        ArrayList<Jogador> jogadores3 = new ArrayList<>();
        jogadores3.add(new Jogador("NB", 1, 1));
        jogadores3.add(new Jogador("NC", 2, 2));
        jogadores3.add(new Jogador("ND", 3, 3));
        jogadores3.add(new Jogador("NE", 4, 2));
        jogadores3.add(new Jogador("NF", 5, 1));
        Time t3 = new Time("Time 3", jogadores3);
        campeonato = new ArrayList<>();
        campeonato.add(t1);
        campeonato.add(t2);
        campeonato.add(t3);
    }

    @org.junit.jupiter.api.Test
    void timeComMaisGols() {
        Time timemaisgols = Campeonato.timeComMaisGols(campeonato);
        assertEquals("Time 2 (5)", timemaisgols.toString());
    }

    @Test
    void artilheiroCampionato() {

    }
}

package bancoDeDados.Test;

import bancoDeDados.CidadeService;
import bancoDeDados.Conexao;
import bancoDeDados.Model.Cidade;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ConexaoTest {

    @Test
    void conexaoTest() {
        assertNotNull(Conexao.conectaPostgres());
    }
    @Test
    void insereCidadeTest() {
        Cidade c = new Cidade(0,"Araranguá","SC");
        assertEquals(1, CidadeService.insereCidade(c));
    }
    @Test
    void alteraCidadeTest() {
        Cidade c = new Cidade(1, "Goiâna","GO");
        assertEquals(1, CidadeService.alteraCidade(c));
        assertEquals(1,CidadeService.deletaCidade(c));
        Cidade c2 = new Cidade(25, "Brasília","DF");
        assertEquals(0, CidadeService.alteraCidade(c2));
    }
    @Test
    void listaCidadeTest() {
        ArrayList<Cidade> lista = CidadeService.listAll();
        for(Cidade c : lista) {
            System.out.println(c);
        }
    }
}
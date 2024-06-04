package bancoDeDados.Test;

import bancoDeDados.CidadeService;
import bancoDeDados.ClienteService;
import bancoDeDados.Model.Cidade;
import bancoDeDados.Model.Cliente;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ClienteTest {
    @BeforeAll
    static void inicializaBases() {
        ClienteService.limpaBaseCliente();
        CidadeService.limpaBaseCidade();
    }
    @Test
    @Order(1)
    void insereCidadeTest() {
        Cidade c = new Cidade(1,"Araranguá","SC");
        assertEquals(1, CidadeService.insereCidade(c));
        c = new Cidade(2, "Braço do Norte","SC");
        assertEquals(1, CidadeService.insereCidade(c));
    }
    @Test
    @Order(2)
    void insereClienteTest() {
        Cliente c = new Cliente(1,11,"A","M", new Cidade(1,"Araranguá","SC"));
        assertEquals(1, ClienteService.insereCliente(c));
    }
    @Test
    @Order(4)
    void alteraClienteTest() {
        Cliente c = new Cliente(1,11,"A","M", new Cidade(2,"Braço do Norte","SC"));
        assertEquals(1, ClienteService.alteraCliente(c));
    }
    @Test
    @Order(5)
    void deletaClienteTest() {
        Cliente c = new Cliente(1,11,"A","M", new Cidade(2,"Braço do Norte","SC"));
        assertEquals(1, ClienteService.deletaCliente(c));
    }
    @Test
    @Order(3)
    void listaClienteTest() {
        ArrayList<Cliente> lista = ClienteService.listAll();
        for (Cliente c : lista) {
            System.out.println(c);
        }
    }
    @Test
    @Order(6)
    void alteraCidadeTest() {
        Cidade c = new Cidade(1, "Goiâna","GO");
        assertEquals(1, CidadeService.alteraCidade(c));
        assertEquals(1,CidadeService.deletaCidade(c));
        Cidade c2 = new Cidade(25, "Brasília","DF");
        assertEquals(0, CidadeService.alteraCidade(c2));
    }
    @Test
    @Order(7)
    void listaCidadeTest() {
        ArrayList<Cidade> lista = CidadeService.listAll();
        for(Cidade c : lista) {
            System.out.println(c);
        }
    }
    @Test
    @Order(8)
    void deletaCidadeTest() {
        Cidade c = new Cidade(2,"Araranguá","SC");
        assertEquals(1, CidadeService.deletaCidade(c));
    }
}

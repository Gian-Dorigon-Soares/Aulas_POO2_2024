package exercicio_banco.test;

import exercicio_banco.Banco;
import exercicio_banco.ContaBancaria;
import exercicio_banco.ContaEspecial;
import exercicio_banco.ContaPoupanca;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class BancoTest {
    private ContaBancaria c1;
    private ContaEspecial ce2;
    private ContaPoupanca cp3;
    private Banco b1;

    @BeforeEach
    void setUpBanco () {
        c1 = new ContaBancaria(1, 100.0);
        ce2 = new ContaEspecial(2, 200.0, 50.0);
        cp3 = new ContaPoupanca(3, 300.0);
        b1 = new Banco();
        b1.setContas(c1);
        b1.setContas(ce2);
        b1.setContas(cp3);
    }

    @Test
    void listaContas () {
        assertEquals("1 - 100.0\n2 - 200.0\n3 - 300.0\n", b1.listaContas());
    }
    
}

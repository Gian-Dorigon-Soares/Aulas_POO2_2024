package exercicio_banco.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import exercicio_banco.ContaBancaria;

public class ContaBancariaTest {
    private ContaBancaria c1;
    private ContaBancaria c2;

    @BeforeEach
    void setUpContas () {
        c1 = new ContaBancaria();
        c2 = new ContaBancaria(1,100.0);
    }

    @Test
    void saldoTest () {
        assertEquals(false, c1.saque(100.0));
        assertEquals(true, c2.saque(100.0));
        assertEquals(false, c2.saque(100.0));
    }

    @Test
    void depositoTest() {
        assertEquals(true, c1.deposito(100.0));
        assertEquals(true, c2.deposito(100.0));
        assertEquals(false, c1.deposito(-100.0));
        assertEquals(false, c2.deposito(0.0));
    }

    @Test
    void transferenciaTest() {
        assertEquals(true, c2.transferencia(c1, 50.0));
        assertEquals(false, c1.transferencia(c2, 100.0));
        assertEquals(false, c2.transferencia(c2, 50.0));
    }
}

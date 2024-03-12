package exercicio_banco.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import exercicio_banco.ContaPoupanca;
public class ContaPoupancaTest {
    private ContaPoupanca cp1;
    private ContaPoupanca cp2;

    @BeforeEach
    void setUpContasPoupanças () {
        cp1 = new ContaPoupanca();
        cp2 = new ContaPoupanca(1,100.0);
    }

    @Test
    void saqueTest () {
        assertEquals(true, cp2.saque(9.0));
        assertEquals(true, cp2.saque(9.0));
        assertEquals(true, cp2.saque(9.0));
        assertEquals(true, cp2.saque(9.0));
        assertEquals(true, cp2.saque(9.0));
        assertEquals(false, cp2.saque(9.0));
        assertEquals(false, cp1.saque(9.0));
    }

    @Test
    void transferenciatest () {
        assertEquals(true, cp2.transferencia(cp1, 9.0));
        assertEquals(true, cp2.transferencia(cp1, 9.0));
        assertEquals(true, cp2.transferencia(cp1, 9.0));
        assertEquals(true, cp2.transferencia(cp1, 9.0));
        assertEquals(true, cp2.transferencia(cp1, 9.0));
        assertEquals(false, cp2.transferencia(cp1, 9.0));
        assertEquals(false, cp1.transferencia(cp2, 100.0));
    }
}

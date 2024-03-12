package exercicio_banco.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import exercicio_banco.ContaEspecial;

public class ContaEspecialTest {
    private ContaEspecial ce1;
    private ContaEspecial ce2;

    @BeforeEach
    void setUpContasEspeciais () {
        ce1 = new ContaEspecial();
        ce2 = new ContaEspecial(1, 100.0, 50.0);
    }

    @Test
    void saqueTest () {
        assertEquals(true, ce2.saque(25.0));
        assertEquals(false,ce2.saque(75.0));
        assertEquals(false, ce1.saque(100.0));
    }
    @Test
    void transferenciaTest () {
        assertEquals(true, ce2.transferencia(ce1, 25.0));
        assertEquals(false, ce2.transferencia(ce1, 75.0));
        assertEquals(false, ce1.transferencia(ce2, 25.0));
    }
}

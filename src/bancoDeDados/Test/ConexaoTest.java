package bancoDeDados.Test;

import bancoDeDados.Conexao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConexaoTest {

    @Test
            void conexaoTest() {
        assertNotNull(Conexao.conectaPostgres());
    }
}
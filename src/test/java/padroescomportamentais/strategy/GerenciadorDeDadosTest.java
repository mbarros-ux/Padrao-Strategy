package padroescomportamentais.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GerenciadorDeDadosTest {

    private GerenciadorDeDados gerenciador;

    @BeforeEach
    public void setUp() {
        gerenciador = new GerenciadorDeDados(new CriptografiaAES());
    }

    @Test
    public void deveCriptografarComAES() {
        String resultado = gerenciador.protegerDados("senha123");
        assertTrue(resultado.contains("AES"));
    }

    @Test
    public void deveTrocarEstrategiaParaRSA() {
        gerenciador.setEstrategia(new CriptografiaRSA());
        String resultado = gerenciador.protegerDados("chave_secreta");
        assertTrue(resultado.contains("RSA"));
    }

    @Test
    public void deveGerarHashSHA256() {
        gerenciador.setEstrategia(new CriptografiaSHA256());
        String resultado = gerenciador.protegerDados("arquivo.txt");
        assertTrue(resultado.contains("SHA-256"));
    }

    @Test
    public void deveManterContextoDesacoplado() {
        gerenciador.setEstrategia(new CriptografiaRSA());
        assertTrue(gerenciador.protegerDados("dados") instanceof String);
    }
}
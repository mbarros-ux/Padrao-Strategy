package padroescomportamentais.strategy;

public class CriptografiaSHA256 implements EstrategiaCriptografia {
    @Override
    public String criptografar(String dados) {
        return "Hash SHA-256 gerado para integridade: [" + dados + "]";
    }
}
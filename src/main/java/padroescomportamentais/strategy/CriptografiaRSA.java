package padroescomportamentais.strategy;

public class CriptografiaRSA implements EstrategiaCriptografia {
    @Override
    public String criptografar(String dados) {
        return "Dados criptografados com RSA (Assimétrico): [" + dados + "]";
    }
}
package padroescomportamentais.strategy;

public class CriptografiaAES implements EstrategiaCriptografia {
    @Override
    public String criptografar(String dados) {
        return "Dados criptografados com AES (Simétrico): [" + dados + "]";
    }
}
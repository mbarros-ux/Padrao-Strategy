package padroescomportamentais.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        GerenciadorDeDados gerenciador = new GerenciadorDeDados(new CriptografiaAES());
        System.out.println(gerenciador.protegerDados("senha_banco"));

        gerenciador.setEstrategia(new CriptografiaRSA());
        System.out.println(gerenciador.protegerDados("chave_privada"));

        gerenciador.setEstrategia(new CriptografiaSHA256());
        System.out.println(gerenciador.protegerDados("arquivo_contrato.pdf"));
    }
}
package padroescomportamentais.strategy;

public class GerenciadorDeDados {
    private EstrategiaCriptografia estrategia;

    public GerenciadorDeDados(EstrategiaCriptografia estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaCriptografia estrategia) {
        this.estrategia = estrategia;
    }

    public String protegerDados(String dados) {
        return estrategia.criptografar(dados);
    }
}
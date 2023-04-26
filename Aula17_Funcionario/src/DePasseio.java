public class DePasseio extends Veiculo{

    private String cor;


    public DePasseio(){}
    public DePasseio(String placa, String modelo, Servico servico, Acessorio acessorio, Peca peca, String cor) {
        super(placa, modelo, servico, acessorio, peca);
        this.cor = cor;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public String toString() {
        return "DePasseio{" +
                "cor='" + cor + '\'' +
                '}';
    }
}

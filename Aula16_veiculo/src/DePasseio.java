public class DePasseio extends Carro{

    private int qtdPassageiros;


    public DePasseio(){}

    public DePasseio(int qtdRodas, int ano, String cor, String placa, int qtdPortas, String marca, int qtdPassageiros) {
        super(qtdRodas, ano, cor, placa, qtdPortas, marca);
        this.qtdPassageiros = qtdPassageiros;
    }


    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }


    @Override
    public String toString() {
        return "DePasseio: \n" +
                "Quantidade de Rodas = " + this.getQtdRodas() + "\n" +
                "Ano = " + this.getAno() + "\n" +
                "Cor = " + this.getCor() + "\n" +
                "Placa = " + this.getPlaca() + "\n" +
                "Quantidade de Portas = " + this.getQtdPortas() + "\n"+
                "Marca = " + this.getMarca() + "\n"+
                "Quantidade de Passageiros = " + qtdPassageiros + "\n";
    }
}

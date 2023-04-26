public class Onibus extends Veiculo{

    private int qtdPassageiros;


    public Onibus(){}
    public Onibus(String marca, String placa, String cor, double valor, Servico servico, int qtdPassageiros) {
        super(marca, placa, cor, valor, servico);
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
        return "Onibus: " + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Placa: " + getPlaca() + "\n" +
                "Cor: " + getCor() + "\n" +
                "Valor: " + valor + "\n" +
                getServico() + "\n" +
                "Quantidade de Passageiros: " + qtdPassageiros;
    }
}

public class DeCarga extends Carro {

    private double capacidade;


    public DeCarga(){}

    public DeCarga(int qtdRodas, int ano, String cor, String placa, int qtdPortas, String marca, double capacidade) {
        super(qtdRodas, ano, cor, placa, qtdPortas, marca);
        this.capacidade = capacidade;
    }



    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }


    @Override
    public String toString() {
        return "De Carga: \n" +
                "Quantidade de Rodas = " + this.getQtdRodas() + "\n" +
                "Ano = " + this.getAno() + "\n" +
                "Cor = " + this.getCor() + "\n" +
                "Placa = " + this.getPlaca() + "\n" +
                "Quantidade de Portas = " + this.getQtdPortas() + "\n"+
                "Marca = " + this.getMarca() + "\n"+
                "Capacidade = " + capacidade + "\n";
    }
}

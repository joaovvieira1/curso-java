public class Moto extends Veiculo{

    private double cilindrada;


    public Moto(){}

    public Moto(int qtdRodas, int ano, String cor, String placa, double cilindrada) {
        super(qtdRodas, ano, cor, placa);
        this.cilindrada = cilindrada;
    }

    public Moto(double cilindrada) {
        this.cilindrada = cilindrada;
    }


    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public String toString() {
        return "Moto: \n" +
                "Quantidade de Rodas = " + this.getQtdRodas() + "\n" +
                "Ano = " + this.getAno() + "\n" +
                "Cor = " + this.getCor() + "\n" +
                "Placa = " + this.getPlaca() + "\n" +
                "Cilindrada = " + cilindrada + "\n";
    }
}

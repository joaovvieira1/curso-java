public class Moto extends Veiculo{

    private int cilindrada;


    public Moto(){}
    public Moto(String placa, int ano, String cor, double preco, Proprietario proprietario, int cilindrada) {
        super(placa, ano, cor, preco, proprietario);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public double ipva() {
        return 0.08 * getPreco();
    }

    @Override
    public double seguro() {
        return 0.05 * getPreco();
    }

    @Override
    public String toString() {
        return "\nMoto: \n" +
                "Placa = " + this.getPlaca() + "\n" +
                "Ano = " + this.getAno() + "\n" +
                "Cor = " + this.getCor() + "\n" +
                "Preço = " + this.getPreco() + "\n" +
                "Valor do IPVA = " + this.ipva() + "\n" +
                "Valor do Seguro = " +this.seguro() + "\n"+
                "Cilindrada = " + cilindrada +
                this.getProprietario();

    }
}

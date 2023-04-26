public class Onibus extends Veiculo{

    private int qtdPassageiros;
    private Montadora montadora;


    public Onibus(){}
    public Onibus(String placa, int ano, String cor, double preco, Proprietario proprietario, int qtdPassageiros, Montadora montadora) {
        super(placa, ano, cor, preco, proprietario);
        this.qtdPassageiros = qtdPassageiros;
        this.montadora = montadora;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }


    @Override
    public double ipva() {
        return 0.05 * getPreco();
    }

    @Override
    public double seguro() {
        return 0.025 * getPreco();
    }


    @Override
    public String toString() {
        return "\nOnibus: \n" +
                "Placa = " + this.getPlaca() + "\n" +
                "Ano = " + this.getAno() + "\n" +
                "Cor = " + this.getCor() + "\n" +
                "Preço = " + this.getPreco() + "\n" +
                "Valor do IPVA = " + this.ipva() + "\n" +
                "Valor do Seguro = " +this.seguro() + "\n"+
                "Quantidade de Passageiros = " + qtdPassageiros + "\n" +
                this.getProprietario() +
                 montadora + "\n";
    }
}

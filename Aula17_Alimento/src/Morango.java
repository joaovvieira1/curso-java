public class Morango extends Organico{

    private double precoFardo;


    public Morango(){}
    public Morango(String dataValidade, double preco, String nome, String nomeProdutor, double precoFardo) {
        super(dataValidade, preco, nome, nomeProdutor);
        this.precoFardo = precoFardo;
    }


    public double getPrecoFardo() {
        return precoFardo;
    }

    public void setPrecoFardo(double precoFardo) {
        this.precoFardo = precoFardo;
    }


    @Override
    public String toString() {
        return "Morango: " + "\n" +
                "Data de Validade: " + this.getDataValidade() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Nome do Produtor: " + this.getNomeProdutor() + "\n" +
                "Preço do Fardo: " + precoFardo + "\n";
    }
}

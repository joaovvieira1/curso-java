public class Tomate extends Organico{

    private double peso;


    public Tomate(){}
    public Tomate(String dataValidade, double preco, String nome, String nomeProdutor, double peso) {
        super(dataValidade, preco, nome, nomeProdutor);
        this.peso = peso;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "Tomate: " + "\n" +
                "Data de Validade: " + this.getDataValidade() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Nome do Produtor: " + this.getNomeProdutor() + "\n" +
                "Peso: " + peso + "\n";
    }
}

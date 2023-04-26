public class Alface extends Organico{

    private int quantidade;


    public Alface(){}
    public Alface(String dataValidade, double preco, String nome, String nomeProdutor, int quantidade) {
        super(dataValidade, preco, nome, nomeProdutor);
        this.quantidade = quantidade;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "Alface: " + "\n" +
                "Data de Validade: " + this.getDataValidade() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Nome do Produtor: " + this.getNomeProdutor() + "\n" +
                "Quantidade: " + quantidade + "\n";
    }
}

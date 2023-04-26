public class PickUp extends Veiculo{

    private double preco;


    public PickUp(){}
    public PickUp(String placa, String modelo, Servico servico, Acessorio acessorio, Peca peca, double preco) {
        super(placa, modelo, servico, acessorio, peca);
        this.preco = preco;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "PickUp{" +
                "preco=" + preco +
                '}';
    }
}

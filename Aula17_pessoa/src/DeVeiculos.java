public class DeVeiculos extends Vendedor{

    private int qtdVendida;


    public DeVeiculos(){}
    public DeVeiculos(String nome, String endereco, int metricula, double salario, int qtdVendida) {
        super(nome, endereco, metricula, salario);
        this.qtdVendida = qtdVendida;
    }


    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }


    @Override
    public String toString() {
        return "Vendedor de Veiculos: " + "\n" +
                "Nome = " + this.getNome() + "\n" +
                "Endereço = " + this.getEndereco() + "\n" +
                "Matricula = " + this.getMetricula() + "\n" +
                "Salario = " + this.getSalario() + "\n" +
                "Vendas = " + qtdVendida + "\n";
    }
}

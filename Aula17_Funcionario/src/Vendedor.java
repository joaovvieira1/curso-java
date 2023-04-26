public class Vendedor extends Funcionario {

    private double valorComissao;
    private Venda venda;


    public Vendedor(){}
    public Vendedor(int matricula, String nome, double salario, Endereco endereco, double valorComissao, Venda venda) {
        super(matricula, nome, salario, endereco);
        this.valorComissao = valorComissao;
        this.venda = venda;
    }


    public double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(double valorComissao) {
        this.valorComissao = valorComissao;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }


    @Override
    public String toString() {
        return "Vendedor: " + "\n" +
                "Matricula: " + this.getMatricula() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Salario: " + this.getSalario() + "\n" +
                getEndereco() + "\n" +
                "Valor de Comissao: " + valorComissao + "\n" +
                venda + "\n";
    }
}

public class Funcionario extends Pessoa implements Comissao{

    private int matr;
    private double valorComissao;


    public Funcionario(){}
    public Funcionario(String cpf, String nome, Endereco endereco, int matr, double valorComissao) {
        super(cpf, nome, endereco);
        this.matr = matr;
        this.valorComissao = valorComissao;
    }


    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(double valorComissao) {
        this.valorComissao = valorComissao;
    }


    @Override
    public double calculaSalComissao() {
        return sal + getValorComissao();
    }


    @Override
    public String toString() {
        return "Funcionario: " + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Nome: " + getNome() + "\n" +
                getEndereco() + "\n" +
                "Matricula: " + matr + "\n" +
                "Valor da Comissão: " + valorComissao + "\n";
    }


}

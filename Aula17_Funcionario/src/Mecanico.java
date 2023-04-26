public class Mecanico extends Funcionario{

    private double comissao;


    public Mecanico(){}
    public Mecanico(int matricula, String nome, double salario, Endereco endereco, double comissao) {
        super(matricula, nome, salario, endereco);
        this.comissao = comissao;
    }


    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    @Override
    public String toString() {
        return "Mecanico: " + "\n" +
                "Matricula: " + this.getMatricula() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Salario: " + this.getSalario() + "\n" +
                getEndereco() + "\n" +
                "Comissão: " + comissao + "\n";
    }
}

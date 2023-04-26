public class Atendente extends Funcionario{

    private int qldAtendimento;


    public Atendente(){}
    public Atendente(int matricula, String nome, double salario, Endereco endereco, int qldAtendimento) {
        super(matricula, nome, salario, endereco);
        this.qldAtendimento = qldAtendimento;
    }


    public int getQldAtendimento() {
        return qldAtendimento;
    }

    public void setQldAtendimento(int qldAtendimento) {
        this.qldAtendimento = qldAtendimento;
    }


    @Override
    public String toString() {
        return "Atendente: " + "\n" +
                "Matricula: " + this.getMatricula() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Salario: " + this.getSalario() + "\n" +
                getEndereco() + "\n" +
                "Quantidade de Atendimentos: " + qldAtendimento + "\n";
    }
}

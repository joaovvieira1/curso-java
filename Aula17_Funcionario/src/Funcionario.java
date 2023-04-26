public class Funcionario {

    private int matricula;
    private String nome;
    private double salario;
    private Endereco endereco;


    public Funcionario(){}
    public Funcionario(int matricula, String nome, double salario, Endereco endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

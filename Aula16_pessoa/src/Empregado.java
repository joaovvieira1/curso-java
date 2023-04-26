public class Empregado extends Pessoa{

    private double salario;


    public Empregado(){}

    public Empregado(double salario) {
        this.salario = salario;
    }

    public Empregado(String codigo, String nome, int idade, double salario) {
        super(codigo, nome, idade);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Empregado:" + "\n" +
                "salario = " + salario + "\n" +
                "nome = " + this.getNome() + "\n"+
                "idade = " + this.getIdade() + "\n"+
                "codigo = " + this.getCodigo();
    }
}

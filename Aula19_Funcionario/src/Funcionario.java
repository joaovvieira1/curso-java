public abstract class Funcionario extends Pessoa {

    private int numero;
    private int horaExtra;
    private double salario;
    private Contracheque contracheque;


    public Funcionario(){}
    public Funcionario(String nome, String cpf, int numero, int horaExtra, double salario, Contracheque contracheque) {
        super(nome, cpf);
        this.numero = numero;
        this.horaExtra = horaExtra;
        this.salario = salario;
        this.contracheque = contracheque;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Contracheque getContracheque() {
        return contracheque;
    }

    public void setContracheque(Contracheque contracheque) {
        this.contracheque = contracheque;
    }


    public abstract double reajusteSal();
}

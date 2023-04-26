public class Vendedor extends Pessoa{

    private int metricula;
    private double salario;


    public Vendedor(){}
    public Vendedor(String nome, String endereco, int metricula, double salario) {
        super(nome, endereco);
        this.metricula = metricula;
        this.salario = salario;
    }


    public int getMetricula() {
        return metricula;
    }

    public void setMetricula(int metricula) {
        this.metricula = metricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

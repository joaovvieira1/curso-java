public class Professor extends Pessoa implements Imprimivel,EstadoOrigem{

    private String titulo;


    public Professor(){}
    public Professor(String nome, double salario, String titulo) {
        super(nome, salario);
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public double calculaSalario() {
        return getSalario() + gratificacao;
    }


    @Override
    public String toString() {
        return "Professor: " + "\n" +
                "Nome: " + getNome() + "\n" +
                "Salario: " + getSalario() + "\n" +
                "Titulo: " + titulo + "\n" +
                "Com gratificação: " + calculaSalario() + "\n";
    }
}

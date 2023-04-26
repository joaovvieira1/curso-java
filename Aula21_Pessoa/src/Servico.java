public abstract class Servico {

    private String nome;


    public Servico(){}
    public Servico(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public abstract double totalPagar();
    public abstract String toString();
}

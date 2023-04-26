public class Alimento {

    private String dataValidade;
    private double preco;
    private String nome;


    public Alimento(){}
    public Alimento(String dataValidade, double preco, String nome) {
        this.dataValidade = dataValidade;
        this.preco = preco;
        this.nome = nome;
    }


    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

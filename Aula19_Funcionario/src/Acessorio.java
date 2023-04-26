public class Acessorio {

    private String nome;
    private double preco;


    public Acessorio(){}
    public Acessorio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Acessorio: " + "\n" +
                "Nome: " + nome + "\n" +
                "Preço: " + preco + "\n";
    }
}

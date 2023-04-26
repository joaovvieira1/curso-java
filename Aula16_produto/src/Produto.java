public class Produto {

    private String codBarra;
    private String nome;
    private String preco;


    public Produto(){}

    public Produto(String codBarra, String nome, String preco) {
        this.codBarra = codBarra;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}

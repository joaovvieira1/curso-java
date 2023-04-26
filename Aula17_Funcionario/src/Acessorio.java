public class Acessorio {

    private int codigo;
    private String nome;
    private double preco;
    private Fornecedor fornecedor;


    public Acessorio(){}
    public Acessorio(int codigo, String nome, double preco, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


    @Override
    public String toString() {
        return "Acessorio: " + "\n" +
                "Codigo: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Preço: " + preco + "\n" +
                fornecedor + "\n";
    }
}

public class Produto {

    private String codBarra;
    private String descricao;
    private double preco;
    private Fornecedor fornecedor;


    public Produto(){}
    public Produto(String codBarra, String descricao, double preco, Fornecedor fornecedor) {
        this.codBarra = codBarra;
        this.descricao = descricao;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }


    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        return "Produto{" +
                "codBarra='" + codBarra + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", fornecedor=" + fornecedor +
                '}';
    }
}

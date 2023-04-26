public class Supermercado {

    private String cnpj;
    private String razaoSocial;
    private String telefone;
    private Produto produto;
    private Endereco endereco;
    private Cliente cliente;


    public Supermercado(){}
    public Supermercado(String cnpj, String razaoSocial, String telefone, Produto produto, Endereco endereco, Cliente cliente) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
        this.produto = produto;
        this.endereco = endereco;
        this.cliente = cliente;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", telefone='" + telefone + '\'' +
                ", produto=" + produto +
                ", endereco=" + endereco +
                ", cliente=" + cliente +
                '}';
    }
}

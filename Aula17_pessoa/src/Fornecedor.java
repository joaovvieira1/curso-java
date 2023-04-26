public class Fornecedor extends Pessoa{

    private String cnpj;
    private String pais;


    public Fornecedor(){}
    public Fornecedor(String nome, String endereco, String cnpj, String pais) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.pais = pais;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    @Override
    public String toString() {
        return "Fornecedor: \n" +
                "Nome = " + this.getNome() + "\n" +
                "Endereço = " + this.getEndereco() + "\n" +
                "CNPJ = " + cnpj + "\n" +
                "Pais = " + pais + "\n";
    }
}

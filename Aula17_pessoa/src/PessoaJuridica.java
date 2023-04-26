public class PessoaJuridica extends Cliente{

    private String cnpj;


    public PessoaJuridica(){}
    public PessoaJuridica(String nome, String endereco, int idade, String cnpj) {
        super(nome, endereco, idade);
        this.cnpj = cnpj;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override
    public String toString() {
        return "Pessoa Juridica: " + "\n" +
                "Nome = " + this.getNome() + "\n" +
                "Endereço = " + this.getEndereco() + "\n" +
                "Idade = " + this.getIdade() + "\n" +
                "CNPJ = " + cnpj + "\n";
    }
}

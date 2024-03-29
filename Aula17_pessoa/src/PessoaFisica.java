public class PessoaFisica extends Cliente{

    private String cpf;


    public PessoaFisica(){}
    public PessoaFisica(String nome, String endereco, int idade, String cpf) {
        super(nome, endereco, idade);
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "Pessoa Fisica: " + "\n" +
                "Nome = " + this.getNome() + "\n" +
                "Endereço = " + this.getEndereco() + "\n" +
                "Idade = " + this.getIdade() + "\n" +
                "CPF = " + cpf + "\n";
    }
}

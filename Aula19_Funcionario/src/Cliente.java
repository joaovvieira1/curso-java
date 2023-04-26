public class Cliente extends Pessoa{

    private int idade;
    private String telefone;


    public Cliente(){}
    public Cliente(String nome, String cpf, int idade, String telefone) {
        super(nome, cpf);
        this.idade = idade;
        this.telefone = telefone;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Cliente: " + "\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Idade: " + idade + "\n" +
                "Telefone: " + telefone;
    }
}

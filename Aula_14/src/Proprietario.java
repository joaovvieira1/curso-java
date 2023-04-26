public class Proprietario {

    private String nome;

    private String endereco;

    private Filiacao filiacao;

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", filiacao=" + filiacao +
                '}';
    }

    public Proprietario (){}

    public Proprietario(String nome, String endereco, Filiacao filiacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.filiacao = filiacao;
    }
}

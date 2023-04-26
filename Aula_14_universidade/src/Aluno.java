public class Aluno {

    private String nome;
    private int matricula;
    private Endereco endereco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public Aluno(){}
    public Aluno(String nome, int matricula, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", endereco=" + endereco +
                '}';
    }
}

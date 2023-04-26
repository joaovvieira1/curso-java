import java.util.ArrayList;

public class Universidade {

    private String nome;

    private Endereco endereco;

    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public Universidade(){}
    public Universidade(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }


    @Override
    public String toString() {
        return "Universidade{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", listaDeAlunos=" + listaDeAlunos +
                '}';
    }
}

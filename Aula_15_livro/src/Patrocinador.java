public class Patrocinador {

    private String nome;
    private Endereco endereco;
    private Editora editora;


    public Patrocinador(){}

    public Patrocinador(String nome, Endereco endereco, Editora editora) {
        this.nome = nome;
        this.endereco = endereco;
        this.editora = editora;
    }


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

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }


    @Override
    public String toString() {
        return "Patrocinador{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", editora=" + editora +
                '}';
    }
}

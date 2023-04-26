public class Cachorro {

    private String codigo;
    private String nome;
    private String raca;
    private Proprietario propritario;
    private Filiacao filiacao;

    public Proprietario getPropritario() {
        return propritario;
    }

    public void setPropritario(Proprietario propritario) {
        this.propritario = propritario;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", propritario=" + propritario +
                ", filiacao=" + filiacao +
                '}';
    }

    public Cachorro(){}

    public Cachorro(String codigo, String nome, String raca, Proprietario propritario, Filiacao filiacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
        this.propritario = propritario;
        this.filiacao = filiacao;
    }
}

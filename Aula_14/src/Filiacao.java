public class Filiacao {

    private String nomeDoPai;
    private String nomeDaMae;

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    @Override
    public String toString() {
        return "Filiacao{" +
                "nomeDoPai='" + nomeDoPai + '\'' +
                ", nomeDaMae='" + nomeDaMae + '\'' +
                '}';
    }

    public Filiacao(){}
    public Filiacao(String nomeDoPai, String nomeDaMae) {
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
    }
}

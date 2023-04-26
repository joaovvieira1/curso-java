public abstract class FiguraGeometrica {

    private String nome;


    public FiguraGeometrica(){}
    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String toString();
}

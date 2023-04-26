public class Roda {
    private int tamanhoAro;

    public int getTamanhoAro() {
        return tamanhoAro;
    }

    public void setTamanhoAro(int tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }


    public Roda(){}
    public Roda(int tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }


    @Override
    public String toString() {
        return "Roda{" +
                "tamanhoAro=" + tamanhoAro +
                '}';
    }
}

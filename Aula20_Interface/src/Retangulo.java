public class Retangulo extends FiguraGeometrica implements ObjetoGeometrico{

    private double ladoMenor;
    private double ladoMaior;


    public Retangulo(){}
    public Retangulo(String nome, double ladoMenor, double ladoMaior) {
        super(nome);
        this.ladoMenor = ladoMenor;
        this.ladoMaior = ladoMaior;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMaior() {
        return ladoMaior;
    }

    public void setLadoMaior(double ladoMaior) {
        this.ladoMaior = ladoMaior;
    }


    @Override
    public String toString() {
        return "Retangulo: " + "\n" +
                "Nome: " + getNome() + "\n" +
                "Lado menor: " + ladoMenor + "\n" +
                "Lado maior: " + ladoMaior + "\n" +
                "Area: " + this.calculaArea() + "\n" +
                "Perimetro: " + this.calculaPerimetro();
    }

    @Override
    public double calculaArea() {
        return getLadoMenor() * getLadoMaior();
    }

    @Override
    public double calculaPerimetro() {
        return (2 * getLadoMenor()) * (2 * getLadoMaior());
    }
}

public class Quadrado extends FiguraGeometrica implements ObjetoGeometrico{


    private double lado;


    public Quadrado(){}
    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    @Override
    public String toString() {
        return "Quadrado: " + "\n" +
                "Nome: " + getNome() + "\n" +
                "Lado: " + lado + "\n" +
                "Area: " + this.calculaArea() + "\n" +
                "Perimetro: " + this.calculaPerimetro();
    }

    @Override
    public double calculaArea() {
        return getLado() * getLado();
    }

    @Override
    public double calculaPerimetro() {
        return (4 * getLado());
    }
}

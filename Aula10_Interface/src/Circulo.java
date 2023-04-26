public class Circulo extends FiguraGeometrica implements ObjetoGeometrico{

        private double raio;

         public Circulo(){}


    public Circulo(String nome, double raio) {
            super(nome);
            this.raio = raio;
        }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public double calculaArea() {
        return Math.PI * (getRaio()*getRaio());
    }

    @Override
    public double calculaPerimetro() {
        return (2*Math.PI) * getRaio();
    }

    @Override
    public String toString() {
        return "Circulo:" + "\n" +
                "Nome: " + getNome() + "\n" +
                "Raio: " + raio + "\n" +
                "Area: " + this.calculaArea() + "\n" +
                "Perimetro: " + this.calculaPerimetro();
    }
}

public class Arcondicionado extends Produto{

    private int potenciaWatts;


    public Arcondicionado(){}
    public Arcondicionado(String codBarros, double preco, NotaFiscal notaFiscal, int potenciaWatts) {
        super(codBarros, preco, notaFiscal);
        this.potenciaWatts = potenciaWatts;
    }


    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }


    @Override
    public String toString() {
        return "Ar Condicionado: " + "\n" +
                "Codigo de Barras: " + getCodBarros() + "\n" +
                "Preço: " + preco + "\n" +
                getNotaFiscal() + "\n" +
                "Potencia Watts: " + potenciaWatts + "\n";
    }
}

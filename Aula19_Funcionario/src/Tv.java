public class Tv extends Produto{

    private int polegadas;


    public Tv(){}
    public Tv(String codBarros, double preco, NotaFiscal notaFiscal, int polegadas) {
        super(codBarros, preco, notaFiscal);
        this.polegadas = polegadas;
    }


    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }


    @Override
    public String toString() {
        return "Tv: " + "\n" +
                "Codigo de Barras: " + getCodBarros() + "\n" +
                "Preço: " + preco + "\n" +
                getNotaFiscal() + "\n" +
                "Polegadas: " + polegadas + "\n";
    }
}

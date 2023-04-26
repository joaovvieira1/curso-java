public class Piscina extends Produto{

    private int qtdLitros;


    public Piscina(){}
    public Piscina(String codBarros, double preco, NotaFiscal notaFiscal, int qtdLitros) {
        super(codBarros, preco, notaFiscal);
        this.qtdLitros = qtdLitros;
    }


    public int getQtdLitros() {
        return qtdLitros;
    }

    public void setQtdLitros(int qtdLitros) {
        this.qtdLitros = qtdLitros;
    }


    @Override
    public String toString() {
        return "Piscina: " + "\n" +
                "Codigo de Barras: " + getCodBarros() + "\n" +
                "Preço: " + preco + "\n" +
                getNotaFiscal() + "\n" +
                "Quantidade de Litros: " + qtdLitros + "\n";
    }
}

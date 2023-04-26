public abstract class Produto {

    private String codBarros;
    public static double preco;
    private NotaFiscal notaFiscal;


    public Produto(){}
    public Produto(String codBarros, double preco, NotaFiscal notaFiscal) {
        this.codBarros = codBarros;
        this.preco = preco;
        this.notaFiscal = notaFiscal;
    }


    public String getCodBarros() {
        return codBarros;
    }

    public void setCodBarros(String codBarros) {
        this.codBarros = codBarros;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

}

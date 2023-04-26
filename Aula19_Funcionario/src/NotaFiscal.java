public class NotaFiscal {

    private String dataEmissao;
    private int numero;
    private double valor;


    public NotaFiscal(){}
    public NotaFiscal(String dataEmissao, int numero, double valor) {
        this.dataEmissao = dataEmissao;
        this.numero = numero;
        this.valor = valor;
    }


    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public static double impostoProd() {
        double imposto;
        imposto = Produto.preco * 0.1;
        return imposto;
    }

    public static double impostoVei(){
        double imposto;
        imposto = Veiculo.valor * 0.2;

        return imposto;
    }


    @Override
    public String toString() {
        return "Nota Fiscal: " + "\n" +
                "Data de Emissao: " + dataEmissao + "\n" +
                "Numero: " + numero + "\n" +
                "Valor: " + valor;
    }
}

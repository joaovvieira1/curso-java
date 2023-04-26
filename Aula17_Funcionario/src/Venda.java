public class Venda {

    private String data;
    private double valor;
    private FormaPagamento formaPagamento;
    private Acessorio acessorio;
    private Peca peca;


    public Venda(){}
    public Venda(String data, double valor, FormaPagamento formaPagamento, Acessorio acessorio, Peca peca) {
        this.data = data;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.acessorio = acessorio;
        this.peca = peca;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    @Override
    public String toString() {
        return "\nVenda: " + "\n" +
                "Data: " + data + "\n" +
                "Valor: " + valor + "\n" +
                formaPagamento + "\n" +
                acessorio + "\n" +
                peca +"\n";
    }
}

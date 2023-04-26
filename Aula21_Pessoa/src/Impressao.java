public class Impressao extends Servico{

    private double valorImpressao;


    public Impressao(){}


    public Impressao(String nome, double valorImpressao) {
        super(nome);
        this.valorImpressao = valorImpressao;
    }


    public double getValorImpressao() {
        return valorImpressao;
    }

    public void setValorImpressao(double valorImpressao) {
        this.valorImpressao = valorImpressao;
    }


    @Override
    public double totalPagar() {
        return 0 ;
    }


    @Override
    public String toString() {
        return "Impressao: " + "\n" +
                "Nome: " + getNome() + "\n" +
                "Valor da Impressao: " + valorImpressao + "\n" +
                "Total a pagar: " + totalPagar();
    }
}

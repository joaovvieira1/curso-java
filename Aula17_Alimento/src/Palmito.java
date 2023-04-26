public class Palmito extends EmConserva{

    private String tipoPalm;


    public Palmito(){}
    public Palmito(String dataValidade, double preco, String nome, int qtdGramas, String tipoPalm) {
        super(dataValidade, preco, nome, qtdGramas);
        this.tipoPalm = tipoPalm;
    }


    public String getTipoPalm() {
        return tipoPalm;
    }

    public void setTipoPalm(String tipoPalm) {
        this.tipoPalm = tipoPalm;
    }


    @Override
    public String toString() {
        return "Palmito: " + "\n" +
                "Data de Validade: " + this.getDataValidade() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Quantidade de Gramas: " + this.getQtdGramas() + "\n" +
                "Tipo de Palmito: " + tipoPalm + "\n";
    }
}

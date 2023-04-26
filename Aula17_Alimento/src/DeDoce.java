public class DeDoce extends Industrializado{

    private int qtdGordura;


    public DeDoce(){}
    public DeDoce(String dataValidade, double preco, String nome, String dataFab, String nomeFab, String codBarra, int qtdGordura) {
        super(dataValidade, preco, nome, dataFab, nomeFab, codBarra);
        this.qtdGordura = qtdGordura;
    }


    public int getQtdGordura() {
        return qtdGordura;
    }

    public void setQtdGordura(int qtdGordura) {
        this.qtdGordura = qtdGordura;
    }
}

public class DeSal extends Industrializado{

    private int qtdSodio;


    public DeSal(){}
    public DeSal(String dataValidade, double preco, String nome, String dataFab, String nomeFab, String codBarra, int qtdSodio) {
        super(dataValidade, preco, nome, dataFab, nomeFab, codBarra);
        this.qtdSodio = qtdSodio;
    }


    public int getQtdSodio() {
        return qtdSodio;
    }

    public void setQtdSodio(int qtdSodio) {
        this.qtdSodio = qtdSodio;
    }
}

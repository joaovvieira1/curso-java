public class EmConserva extends Alimento{

    private int qtdGramas;


    public EmConserva(){}
    public EmConserva(String dataValidade, double preco, String nome, int qtdGramas) {
        super(dataValidade, preco, nome);
        this.qtdGramas = qtdGramas;
    }


    public int getQtdGramas() {
        return qtdGramas;
    }

    public void setQtdGramas(int qtdGramas) {
        this.qtdGramas = qtdGramas;
    }
}

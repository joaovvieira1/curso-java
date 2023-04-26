public class Caminhao extends Veiculo{

    private int qtdEixos;


    public Caminhao(){}

    public Caminhao(int qtdRodas, int ano, String cor, String placa, int qtdEixos) {
        super(qtdRodas, ano, cor, placa);
        this.qtdEixos = qtdEixos;
    }

    public Caminhao(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }


    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }


    @Override
    public String toString() {
        return "Caminhao: \n" +
                "Quantidade de Rodas = " + this.getQtdRodas() + "\n" +
                "Ano = " + this.getAno() + "\n" +
                "Cor = " + this.getCor() + "\n" +
                "Placa = " + this.getPlaca() + "\n" +
                "Quntidade de Eixos = " + qtdEixos + "\n";
    }
}

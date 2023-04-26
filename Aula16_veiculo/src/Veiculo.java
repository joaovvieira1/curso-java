public class Veiculo {

    private int qtdRodas;
    private int ano;
    private String cor;
    private String placa;


    public Veiculo(){}

    public Veiculo(int qtdRodas, int ano, String cor, String placa) {
        this.qtdRodas = qtdRodas;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }


    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}

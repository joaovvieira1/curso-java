public class Carro extends Veiculo {

    private int qtdPortas;
    private String marca;


    public Carro(){}

    public Carro(int qtdRodas, int ano, String cor, String placa, int qtdPortas, String marca) {
        super(qtdRodas, ano, cor, placa);
        this.qtdPortas = qtdPortas;
        this.marca = marca;
    }


    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

public abstract class Veiculo {

    private String placa;
    private int ano;
    private String cor;
    private double preco;
    private Proprietario proprietario;

    public Veiculo(){}
    public Veiculo(String placa, int ano, String cor, double preco, Proprietario proprietario) {
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Proprietario getProprietario() {
        return proprietario;
    }
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public abstract double ipva();
    public abstract double seguro();
    public abstract String toString();



}

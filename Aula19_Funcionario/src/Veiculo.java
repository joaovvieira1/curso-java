public abstract class Veiculo {

    private String marca;
    private String placa;
    private String cor;
    public static double valor;
    private Servico servico;


    public Veiculo(){}
    public Veiculo(String marca, String placa, String cor, double valor, Servico servico) {
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.valor = valor;
        this.servico = servico;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }



}

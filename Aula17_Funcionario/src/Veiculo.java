public class Veiculo {

    private String placa;
    private String modelo;
    private Servico servico;
    private Acessorio acessorio;
    private Peca peca;


    public Veiculo(){}
    public Veiculo(String placa, String modelo, Servico servico, Acessorio acessorio, Peca peca) {
        this.placa = placa;
        this.modelo = modelo;
        this.servico = servico;
        this.acessorio = acessorio;
        this.peca = peca;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

}

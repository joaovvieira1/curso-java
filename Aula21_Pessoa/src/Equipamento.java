public class Equipamento {

    private String marca;
    private String configuracao;


    public Equipamento(){}
    public Equipamento(String marca, String configuracao) {
        this.marca = marca;
        this.configuracao = configuracao;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }


    @Override
    public String toString() {
        return "Equipamento: " + "\n" +
                "Marca: " + marca + "\n" +
                "Configuração: " + configuracao + "\n";
    }
}

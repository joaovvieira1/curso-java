public class Cliente extends Pessoa{

    private double horasGastas;
    private int qtdPaginasImpressas;
    private Internet internet;
    private Impressao impressao;


    public Cliente(){}
    public Cliente(String cpf, String nome, Endereco endereco, double horasGastas, int qtdPaginasImpressas, Internet internet, Impressao impressao) {
        super(cpf, nome, endereco);
        this.horasGastas = horasGastas;
        this.qtdPaginasImpressas = qtdPaginasImpressas;
        this.internet = internet;
        this.impressao = impressao;
    }


    public double getHorasGastas() {
        return horasGastas;
    }

    public void setHorasGastas(double horasGastas) {
        this.horasGastas = horasGastas;
    }

    public int getQtdPaginasImpressas() {
        return qtdPaginasImpressas;
    }

    public void setQtdPaginasImpressas(int qtdPaginasImpressas) {
        this.qtdPaginasImpressas = qtdPaginasImpressas;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public Impressao getImpressao() {
        return impressao;
    }

    public void setImpressao(Impressao impressao) {
        this.impressao = impressao;
    }


    @Override
    public String toString() {
        return "Cliente: " + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Nome: " + getNome() + "\n" +
                getEndereco() + "\n" +
                "Horas Gastas: " + horasGastas + "\n" +
                "Quantidade de Paginas Impressas: " + qtdPaginasImpressas + "\n" +
                internet + "\n" +
                impressao + "\n";
    }
}

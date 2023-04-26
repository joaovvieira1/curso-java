public class DePasseio extends Veiculo{

    private int qtdPortas;
    private Acessorio acessorio;


    public DePasseio(){}
    public DePasseio(String marca, String placa, String cor, double valor, Servico servico, int qtdPortas, Acessorio acessorio) {
        super(marca, placa, cor, valor, servico);
        this.qtdPortas = qtdPortas;
        this.acessorio = acessorio;
    }


    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }


    @Override
    public String toString() {
        return "De Passeio: " + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Placa: " + getPlaca() + "\n" +
                "Cor: " + getCor() + "\n" +
                "Valor: " + valor + "\n" +
                getServico() + "\n" +
                "Quantidade de Portas: " + qtdPortas + "\n" +
                acessorio;
    }
}

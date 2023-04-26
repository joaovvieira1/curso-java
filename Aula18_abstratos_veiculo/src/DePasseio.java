public class DePasseio extends Veiculo{

    private String marca;
    private String descricao;
    private Montadora montadora;


    public DePasseio(){}

    public DePasseio(String placa, int ano, String cor, double preco, Proprietario proprietario, String marca, String descricao, Montadora montadora) {
        super(placa, ano, cor, preco, proprietario);
        this.marca = marca;
        this.descricao = descricao;
        this.montadora = montadora;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }


    @Override
    public double ipva() {
        return 0.03 * getPreco();
    }

    @Override
    public double seguro() {
        return 0.015 * getPreco();
    }


    @Override
    public String toString() {
        return "DePasseio: " + "\n" +
                "Placa = " + this.getPlaca() + "\n" +
                "Ano = " + this.getAno() + "\n" +
                "Cor = " + this.getCor() + "\n" +
                "Preço = " + this.getPreco() + "\n" +
                "Marca = " + marca + "\n" +
                "Descricao = " + descricao + "\n" +
                "Valor do IPVA = " + this.ipva() + "\n" +
                "Valor do Seguro = " +this.seguro() + "\n"+
                this.getProprietario()+
                 montadora + "\n";
    }
}

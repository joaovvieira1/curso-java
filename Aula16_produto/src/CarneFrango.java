public class CarneFrango extends Produto {

    private String dataValidade;
    private double peso;


    public CarneFrango(){}
    public CarneFrango(String codBarra, String nome, String preco, String dataValidade, double peso) {
        super(codBarra, nome, preco);
        this.dataValidade = dataValidade;
        this.peso = peso;
    }


    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "CarneFrango: \n" +
                "Codigo de Barra = " + this.getCodBarra() + "\n" +
                "Nome = " + this.getNome() + "\n" +
                "preço = " + this.getPreco() + "\n" +
                "Data de Validade = " + dataValidade + '\n' +
                "Peso = " + peso;
    }
}

public class Ovo extends EmConserva{

    private String tipoOvo;


    public Ovo(){}
    public Ovo(String dataValidade, double preco, String nome, int qtdGramas, String tipoOvo) {
        super(dataValidade, preco, nome, qtdGramas);
        this.tipoOvo = tipoOvo;
    }


    public String getTipoOvo() {
        return tipoOvo;
    }

    public void setTipoOvo(String tipoOvo) {
        this.tipoOvo = tipoOvo;
    }


    @Override
    public String toString() {
        return "Ovo: " + "\n" +
                "Data de Validade: " + this.getDataValidade() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Quantidade de Gramas: " + this.getQtdGramas() + "\n" +
                "Tipo de Ovo: " + tipoOvo + "\n";
    }
}

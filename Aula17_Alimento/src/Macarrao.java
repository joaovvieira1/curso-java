public class Macarrao extends DeSal{

    private String tipoMassa;


    public Macarrao(){}

    public Macarrao(String dataValidade, double preco, String nome, String dataFab, String nomeFab, String codBarra, int qtdSodio, String tipoMassa) {
        super(dataValidade, preco, nome, dataFab, nomeFab, codBarra, qtdSodio);
        this.tipoMassa = tipoMassa;
    }


    public String getTipoMassa() {
        return tipoMassa;
    }

    public void setTipoMassa(String tipoMassa) {
        this.tipoMassa = tipoMassa;
    }


    @Override
    public String toString() {
        return "Macarrao: " + "\n" +
                "Data de Validade: " + this.getDataValidade() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Data de Fabricação: " + this.getDataFab() + "\n" +
                "Nome de Fabricante: " + this.getNomeFab() + "\n" +
                "Codigo de Barras: " + this.getCodBarra() + "\n" +
                "Quantidade de Sodio: " + this.getQtdSodio() + "\n" +
                "Tipo de Massa: " + tipoMassa + "\n";
    }
}

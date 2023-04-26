public class Biscoito extends DeSal{

    private String nomeMarca;


    public Biscoito(){}

    public Biscoito(String dataValidade, double preco, String nome, String dataFab, String nomeFab, String codBarra, int qtdSodio, String nomeMarca) {
        super(dataValidade, preco, nome, dataFab, nomeFab, codBarra, qtdSodio);
        this.nomeMarca = nomeMarca;
    }


    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }


    @Override
    public String toString() {
        return "Biscoito: " + "\n" +
                "Data de Validade: " + this.getDataValidade() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Data de Fabricação: " + this.getDataFab() + "\n" +
                "Nome de Fabricante: " + this.getNomeFab() + "\n" +
                "Codigo de Barras: " + this.getCodBarra() + "\n" +
                "Quantidade de Sodio: " + this.getQtdSodio() + "\n" +
                "Nome da Marca: " + nomeMarca + "\n";
    }
}

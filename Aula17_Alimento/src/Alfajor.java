public class Alfajor extends DeDoce{

    private String sabor;


    public Alfajor(){}
    public Alfajor(String dataValidade, double preco, String nome, String dataFab, String nomeFab, String codBarra, int qtdGordura, String sabor) {
        super(dataValidade, preco, nome, dataFab, nomeFab, codBarra, qtdGordura);
        this.sabor = sabor;
    }


    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }


    @Override
    public String toString() {
        return "Alfajor: " + "\n" +
                "Data de Validade: " + this.getDataValidade() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Data de Fabricação: " + this.getDataFab() + "\n" +
                "Nome de Fabricante: " + this.getNomeFab() + "\n" +
                "Codigo de Barras: " + this.getCodBarra() + "\n" +
                "Quantidade de Gordura: " + this.getQtdGordura() + "\n" +
                "Sabor: " + sabor + "\n";
    }
}

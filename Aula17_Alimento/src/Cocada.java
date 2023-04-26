public class Cocada extends DeDoce{

    private String tipoCocada;


    public Cocada(){}
    public Cocada(String dataValidade, double preco, String nome, String dataFab, String nomeFab, String codBarra, int qtdGordura, String tipoCocada) {
        super(dataValidade, preco, nome, dataFab, nomeFab, codBarra, qtdGordura);
        this.tipoCocada = tipoCocada;
    }


    public String getTipoCocada() {
        return tipoCocada;
    }

    public void setTipoCocada(String tipoCocada) {
        this.tipoCocada = tipoCocada;
    }


    @Override
    public String toString() {
        return "Cocada: " + "\n" +
                "Data de Validade: " + this.getDataValidade() + "\n" +
                "Preço: " + this.getPreco() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Data de Fabricação: " + this.getDataFab() + "\n" +
                "Nome de Fabricante: " + this.getNomeFab() + "\n" +
                "Codigo de Barras: " + this.getCodBarra() + "\n" +
                "Quantidade de Gordura: " + this.getQtdGordura() + "\n" +
                "Tipo de Cocada=: " + tipoCocada + "\n";
    }
}

public class SaboneteLiquido extends Produto {

    private int quantidade;
    private String tipoPele;


    public SaboneteLiquido(){}
    public SaboneteLiquido(String codBarra, String nome, String preco, int quantidade, String tipoPele) {
        super(codBarra, nome, preco);
        this.quantidade = quantidade;
        this.tipoPele = tipoPele;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoPele() {
        return tipoPele;
    }

    public void setTipoPele(String tipoPele) {
        this.tipoPele = tipoPele;
    }


    @Override
    public String toString() {
        return "SaboneteLiquido: \n" +
                "Codigo de Barra = " + this.getCodBarra() + "\n" +
                "Nome = " + this.getNome() + "\n" +
                "preço = " + this.getPreco() + "\n" +
                "quantidade = " + quantidade +"\n"+
                "tipoPele = " + tipoPele + '\n';
    }
}

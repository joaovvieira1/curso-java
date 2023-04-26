public class Industrializado extends Alimento{

    private String dataFab;
    private String nomeFab;
    private String codBarra;


    public Industrializado(){}
    public Industrializado(String dataValidade, double preco, String nome, String dataFab, String nomeFab, String codBarra) {
        super(dataValidade, preco, nome);
        this.dataFab = dataFab;
        this.nomeFab = nomeFab;
        this.codBarra = codBarra;
    }


    public String getDataFab() {
        return dataFab;
    }

    public void setDataFab(String dataFab) {
        this.dataFab = dataFab;
    }

    public String getNomeFab() {
        return nomeFab;
    }

    public void setNomeFab(String nomeFab) {
        this.nomeFab = nomeFab;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
}

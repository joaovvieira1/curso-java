public class DeMoveis extends Vendedor{

    private String nomeLoja;
    private String nomeSetor;
    private double comissao;


    public DeMoveis(){}
    public DeMoveis(String nome, String endereco, int metricula, double salario, String nomeLoja, String nomeSetor, double comissao) {
        super(nome, endereco, metricula, salario);
        this.nomeLoja = nomeLoja;
        this.nomeSetor = nomeSetor;
        this.comissao = comissao;
    }


    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    @Override
    public String toString() {
        return "Vendedor de Moveis: " + "\n" +
                "Nome = " + this.getNome() + "\n" +
                "Endereço = " + this.getEndereco() + "\n" +
                "Matricula = " + this.getMetricula() + "\n" +
                "Salario = " + this.getSalario() + "\n" +
                "Nome da Loja = " + nomeLoja + "\n" +
                "Setor = " + nomeSetor + "\n" +
                "Comissao = " + comissao + "\n";
    }
}

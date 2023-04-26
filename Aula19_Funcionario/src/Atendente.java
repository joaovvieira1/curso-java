public class Atendente extends Funcionario{

    private String comissao;


    public Atendente(){}


    public Atendente(String nome, String cpf, int numero, int horaExtra, double salario, Contracheque contracheque, String comissao) {
        super(nome, cpf, numero, horaExtra, salario, contracheque);
        this.comissao = comissao;
    }


    public String getComissao() {
        return comissao;
    }

    public void setComissao(String comissao) {
        this.comissao = comissao;
    }


    @Override
    public double reajusteSal() {
        double reajuste;
        reajuste = this.getSalario() * 0.12;
        reajuste = getSalario() + reajuste;
        return reajuste;
    }


    @Override
    public String toString() {
        return "Atendente: " + "\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Numero: " + getNumero() + "\n" +
                "Hora Extra: " + getHoraExtra() + "\n" +
                "Salario: " + getSalario() + "\n" +
                getContracheque() + "\n" +
                "Comissão: " + comissao + "\n";
    }
}

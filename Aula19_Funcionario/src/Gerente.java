public class Gerente extends Funcionario{

    private String setor;


    public Gerente(){}
    public Gerente(String nome, String cpf, int numero, int horaExtra, double salario, Contracheque contracheque, String setor) {
        super(nome, cpf, numero, horaExtra, salario, contracheque);
        this.setor = setor;
    }


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }


    @Override
    public double reajusteSal() {
        double reajuste;
        reajuste = this.getSalario() * 0.1;
        reajuste = this.getSalario() - reajuste;
        return reajuste;
    }


    @Override
    public String toString() {
        return "Gerente: " + "\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Numero: " + getNumero() + "\n" +
                "Hora Extra: " + getHoraExtra() + "\n" +
                "Salario: " + getSalario() + "\n" +
                getContracheque() + "\n" +
                "Setor: " + setor;
    }
}

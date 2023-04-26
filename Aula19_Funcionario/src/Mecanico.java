public class Mecanico extends Funcionario{

    private String especialidade;


    public Mecanico(){}
    public Mecanico(String nome, String cpf, int numero, int horaExtra, double salario, Contracheque contracheque, String especialidade) {
        super(nome, cpf, numero, horaExtra, salario, contracheque);
        this.especialidade = especialidade;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override
    public double reajusteSal() {
        double reajuste;
        reajuste = this.getSalario() * 0.15;
        reajuste = getSalario() + reajuste;
        return reajuste;
    }


    @Override
    public String toString() {
        return "Mecanico: " + "\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Numero: " + getNumero() + "\n" +
                "Hora Extra: " + getHoraExtra() + "\n" +
                "Salario: " + getSalario() + "\n" +
                getContracheque() + "\n" +
                "Especialidade: " + especialidade + "\n";
    }
}

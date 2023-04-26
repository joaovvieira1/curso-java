public class Tecnico extends Pessoa implements Salario,HoraExtra{

    private String matr;
    private double gratificacao;
    private Equipamento equipamento;


    public Tecnico(){}
    public Tecnico(String cpf, String nome, Endereco endereco, String matr, double gratificacao, Equipamento equipamento) {
        super(cpf, nome, endereco);
        this.matr = matr;
        this.gratificacao = gratificacao;
        this.equipamento = equipamento;
    }


    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    @Override
    public double calculaSalario() {
        return sal + getGratificacao() + (qtdHoraExtra * valorHoraExtra);
    }

    @Override
    public String toString() {
        return "Tecnico: " + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Nome: " + getNome() + "\n" +
                getEndereco() + "\n" +
                "Matricula: " + matr + "\n" +
                "Gratificação: " + gratificacao + "\n" +
                equipamento + "\n";
    }


}

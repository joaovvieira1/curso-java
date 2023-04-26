public class Servico {

    private int codigo;
    private String nome;
    private double preco;
    private Cliente cliente;
    private FormaPagamento formaPagamento;
    private Agendamento agendamento;
    private Mecanico mecanico;


    public Servico(){}
    public Servico(int codigo, String nome, double preco, Cliente cliente, FormaPagamento formaPagamento, Agendamento agendamento, Mecanico mecanico) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.agendamento = agendamento;
        this.mecanico = mecanico;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }


    @Override
    public String toString() {
        return "Servico{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", cliente=" + cliente +
                ", formaPagamento=" + formaPagamento +
                ", agendamento=" + agendamento +
                ", mecanico=" + mecanico +
                '}';
    }
}

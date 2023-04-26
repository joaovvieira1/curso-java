public class Servico {

    private double valor;
    private String descricao;
    private Agendamento agendamento;
    private Mecanico mecanico;
    private Cliente cliente;
    private NotaFiscal notaFiscal;


    public Servico(){}
    public Servico(double valor, String descricao, Agendamento agendamento, Mecanico mecanico, Cliente cliente, NotaFiscal notaFiscal) {
        this.valor = valor;
        this.descricao = descricao;
        this.agendamento = agendamento;
        this.mecanico = mecanico;
        this.cliente = cliente;
        this.notaFiscal = notaFiscal;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }


    @Override
    public String toString() {
        return "Servico: " + "\n" +
                "valor: " + valor + "\n" +
                "Descricao: " + descricao + "\n" +
                agendamento + "\n" +
                mecanico + "\n" +
                cliente + "\n" +
                "Nota Fiscal: " + notaFiscal;
    }
}

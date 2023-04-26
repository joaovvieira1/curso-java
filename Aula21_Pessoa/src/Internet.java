public class Internet extends Servico implements HoraExtra{


    private double valorHora;


    public Internet(){}


    public Internet(String nome, double valorHora) {
        super(nome);
        this.valorHora = valorHora;
    }


    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    @Override
    public double totalPagar() {
        return valorHora * qtdHoraExtra;
    }



    @Override
    public String toString() {
        return "Internet: " + "\n" +
                "Nome: " + getNome() + "\n" +
                "Valor Hora: " + valorHora + "\n" +
                "Total a pagar: " + totalPagar();
    }
}

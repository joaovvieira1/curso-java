public class Loja {

    private String cnpj;
    private Tv tv;
    private Piscina piscina;
    private Arcondicionado arcondicionado;
    private Atendente atendente;
    private Gerente gerente;
    private Cliente cliente;


    public Loja(){}
    public Loja(String cnpj, Tv tv, Piscina piscina, Arcondicionado arcondicionado, Atendente atendente, Gerente gerente, Cliente cliente) {
        this.cnpj = cnpj;
        this.tv = tv;
        this.piscina = piscina;
        this.arcondicionado = arcondicionado;
        this.atendente = atendente;
        this.gerente = gerente;
        this.cliente = cliente;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public Piscina getPiscina() {
        return piscina;
    }

    public void setPiscina(Piscina piscina) {
        this.piscina = piscina;
    }

    public Arcondicionado getArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(Arcondicionado arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public String toString() {
        return "Loja: " + "\n" +
                "cnpj: " + cnpj + "\n" +
                 tv + "\n" +
                 piscina + "\n" +
                 arcondicionado + "\n" +
                 atendente + "\n" +
                 gerente + "\n" +
                "Cliente: " + cliente + "\n";
    }
}

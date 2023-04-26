public class Agendamento {

    private String horario;
    private String local;
    private Atendente atendente;


    public Agendamento(){}
    public Agendamento(String horario, String local, Atendente atendente) {
        this.horario = horario;
        this.local = local;
        this.atendente = atendente;
    }


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }


    @Override
    public String toString() {
        return "Agendamento: " + "\n" +
                "Horario: " + horario + "\n" +
                "Local: " + local + "\n" +
                atendente;
    }
}

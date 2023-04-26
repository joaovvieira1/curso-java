public class Agendamento {

    private String data;
    private String local;


    public Agendamento(){}

    public Agendamento(String data, String local) {
        this.data = data;
        this.local = local;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }


    @Override
    public String toString() {
        return "Agendamento{" +
                "data='" + data + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}

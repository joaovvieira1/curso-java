public class Contracheque {

    private int numero;
    private String data;

    public Contracheque(){}
    public Contracheque(int numero, String data) {
        this.numero = numero;
        this.data = data;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Contra-cheque: " + "\n" +
                "numero: " + numero + "\n" +
                "Data: " + data;
    }
}

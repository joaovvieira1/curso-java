public class Motor {

    private double potencia;
    private String tipoMotor;


    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }


    public Motor(){}
    public Motor(double potencia, String tipoMotor) {
        this.potencia = potencia;
        this.tipoMotor = tipoMotor;
    }


    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", tipoMotor='" + tipoMotor + '\'' +
                '}';
    }
}

public class Carro {

    private int modelo;
    private Motor motor;
    private Roda rodaDireita;
    private Roda rodaEsquerda;


    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda getRodaDireita() {
        return rodaDireita;
    }

    public void setRodaDireita(Roda rodaDireita) {
        this.rodaDireita = rodaDireita;
    }

    public Roda getRodaEsquerda() {
        return rodaEsquerda;
    }

    public void setRodaEsquerda(Roda rodaEsquerda) {
        this.rodaEsquerda = rodaEsquerda;
    }


    public Carro(){}

    public Carro(int modelo, Motor motor, int tamanhoAro) {
        this.modelo = modelo;
        this.motor = motor;
        this.rodaDireita = new Roda(tamanhoAro);
        this.rodaEsquerda = new Roda(tamanhoAro);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo=" + modelo +
                ", motor=" + motor +
                ", rodaDireita=" + rodaDireita +
                ", rodaEsquerda=" + rodaEsquerda +
                '}';
    }
}

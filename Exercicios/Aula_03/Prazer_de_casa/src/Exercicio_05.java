import java.text.DecimalFormat;

public class Exercicio_05 {

    public static void main(String[] args) {

//Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem 1,10m e cresce 3 centímetros por ano.
//Construir um algoritmo que calcule e imprima quantos anos serão necessários para que Juca seja maior que
//Chico.

        int ano = 0;
        double chico = 1.5, juca = 1.1;
        DecimalFormat deci = new DecimalFormat("0.00");

        while (chico>=juca){
            chico = chico + 0.02;
            juca = juca + 0.03;
            ano++;}

        System.out.println("Chico: " + deci.format(chico) + " Juca: " + deci.format(juca));
        System.out.println("São necessarios " + ano + " anos para que Juca seja maior");
    }
}

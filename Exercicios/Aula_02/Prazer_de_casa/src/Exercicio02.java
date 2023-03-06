import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

//Faça um algoritmo que leia três números e mostre-os em ordem decrescente.

        double numero01, numero02, numero03;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        numero01 = leia.nextDouble();
        System.out.println("Insira o segundo numero: ");
        numero02 = leia.nextDouble();
        System.out.println("Insira o terceiro numero: ");
        numero03 = leia.nextDouble();


        if (numero01>numero02 && numero01>numero03){
            System.out.println(numero01);
            if (numero02>numero03){
                System.out.println(numero02);
                System.out.println(numero03);
            }
            else {
                System.out.println(numero03);
                System.out.println(numero02);
            }
        }

        if (numero02>numero01 && numero02>numero03){
            System.out.println(numero02);
            if (numero01>numero03){
                System.out.println(numero01);
                System.out.println(numero03);
            }
            else {
                System.out.println(numero03);
                System.out.println(numero01);
            }
        }

        if (numero03>numero01 && numero03>numero02){
            System.out.println(numero03);
            if (numero01>numero02){
                System.out.println(numero01);
                System.out.println(numero02);
            }
            else {
                System.out.println(numero02);
                System.out.println(numero01);
            }
        }
    }
}

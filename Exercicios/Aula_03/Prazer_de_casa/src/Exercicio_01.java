import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
//maiores do que 8.

        double numero=0;
        int contador=0,numeroMaior=0;
        Scanner leia = new Scanner(System.in);

        for(contador=0;contador<20;contador++){
            System.out.println("Digite um numero: ");
            numero= leia.nextDouble();
             if (numero>8){
                 numeroMaior++;
             }
        }

        System.out.println("A quantidade de numeros maiores que 8 é de " + numeroMaior);

    }
}
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

//Escreva um programa em que lê 15 valores inteiros, encontra o maior e o menor deles e mostra o resultado.

        int valor, valorMaior = 0, valorMenor = 1000000, contador;
        Scanner leia = new Scanner(System.in);

        for (contador = 0; contador<15; contador++){

            System.out.println("Insira um numero inteiro: ");
            valor = leia.nextInt();

            if (valor>valorMaior){
                valorMaior = valor;
            }
            else if (valor<valorMenor) {
                valorMenor = valor;
            }
        }

        System.out.println("O menor valor é " + valorMenor + "! e o maior é " + valorMaior + "!");

    }
}

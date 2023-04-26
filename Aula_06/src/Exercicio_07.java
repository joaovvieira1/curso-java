import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {

//Escreva um programa Java que lê um vetor de números inteiros e exibe o segundo maior número do vetor.

        int qtdNumeros = 0, maior = 0, sMaior = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas posições terão o vetor: ");
        qtdNumeros = leia.nextInt();

        int numeros[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Insira o inteiro pertencente a posição " + i + ": ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        for (int i = 0; i < qtdNumeros; i++){
            if (numeros[i] < maior && numeros[i] > sMaior) {
                sMaior = numeros[i];
            }
        }

        System.out.println("O segundo maior numero do Vetor é " + sMaior + "! ");


    }
}

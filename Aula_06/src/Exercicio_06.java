import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {

//Escreva um programa Java que lê um vetor de números inteiros e exibe a média dos números armazenados em posições ímpares.

        int qtdNumeros, soma = 0, contImpar = 0;
        double media = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o tamanho desejado para o vetor: ");
        qtdNumeros = leia.nextInt();

        int numeros[] = new  int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Insira o inteiro sa posição " + i + ": ");
            numeros[i] = leia.nextInt();
        }
        for (int i = 0; i < qtdNumeros; i++){
            if (i % 2 != 0){
                soma = soma + numeros[i];
                contImpar++;
            }
        }

        media = soma/contImpar;

        System.out.println("A media dos numeros armazenados em posições imapres é de " + media);

    }
}

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

//Faça um programa que lê um conjunto de números inteiros do usuário e armazena esses números em um vetor.
//O programa deve então encontrar e exibir o número de elementos no vetor que são maiores do que a média dos números no vetor.

        int qtdNumeros = 0, media = 0, soma = 0, numerosMaiores = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Deseja que o vetor tenha quantas posições: ");
        qtdNumeros = leia.nextInt();

        int numeros[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Digite o numero da posição " + i + " do vetor: ");
            numeros[i] = leia.nextInt();
        }
        for (int i = 0; i < qtdNumeros; i++){
            soma = soma + numeros[i];
        }

        media = soma/qtdNumeros;

        for (int i = 0; i < qtdNumeros; i++){
            if (numeros[i] > media){
                numerosMaiores++;
            }
        }

        System.out.println("Existem " +numerosMaiores + " numeros maiores que a media dos numeros no vetor");
    }
}

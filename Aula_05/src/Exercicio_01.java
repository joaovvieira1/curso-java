import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

//Faça um programa para ler uma quantidade N de números inteiros e armazená-los
//em um vetor. O programa deve trocar o menor elemento do vetor com o elemento da
//primeira posição, e imprimir o vetor resultante

        int quantidadeDeNumeros = 0, aux = 0, indiceMenorValor = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos inteiros você deseja armazenar? ");
        quantidadeDeNumeros = leia.nextInt();

        int numeros[] = new int[quantidadeDeNumeros];

        for (int i = 0; i < quantidadeDeNumeros; i++){
            System.out.println("Insira o inteiro da posição " + i + ": ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < quantidadeDeNumeros; i++){

            if (numeros[indiceMenorValor] > numeros[i]){
                indiceMenorValor = i;
            }
        }

        aux = numeros[0];
        numeros[0] = numeros[indiceMenorValor];
        numeros[indiceMenorValor] = aux;



        for (int i = 0; i<quantidadeDeNumeros; i++) {
            System.out.println(numeros[i]);

        }
    }
}
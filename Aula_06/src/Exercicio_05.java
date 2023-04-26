import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {

//Escreva um programa Java que lê dois vetores de números inteiros e exibe o vetor resultante da interseção entre eles
// (ou seja, os números que aparecem nos dois vetores).

        int qtdNumeros01 = 0, qtdNumeros02 = 0, qtdNumeros03 = 0, aux = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas posições terá o primeiro vetor: ");
        qtdNumeros01 = leia.nextInt();

        int vetor01[] = new int[qtdNumeros01];

        for (int i = 0; i < qtdNumeros01; i++){
            System.out.println("Insira o numero na posição " + i + " do primeiro vetor: ");
            vetor01[i] = leia.nextInt();
        }

        System.out.println("Quantas posições terá o segundo vetor: ");
        qtdNumeros02 = leia.nextInt();

        int vetor02[] = new int[qtdNumeros02];

        for (int i = 0; i < qtdNumeros02; i++){
            System.out.println("Insira o numero na posição " + i + " do segundo vetor: ");
            vetor02[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros01; i++){
            for (int j = 0; j < qtdNumeros02; j++){
                if (vetor01[i] == vetor02[j]){
                    qtdNumeros03++;
                }
            }
        }
        int intersecao[] = new  int[qtdNumeros03];

        for (int i = 0; i < qtdNumeros01; i++){
            for (int j = 0; j < qtdNumeros02; j++){
                if (vetor01[i] == vetor02[j]){
                    intersecao[aux] = vetor01[i];
                    aux++;
                }
            }
        }

        System.out.println("O vetor de interseção resultante é: ");
        for (int i = 0; i < qtdNumeros03; i++){
            System.out.println(intersecao[i] + " ");
        }


        }


    }


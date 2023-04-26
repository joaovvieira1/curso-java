import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

//Escreva um programa que lê um conjunto de números inteiros do usuário e armazena esses números em um vetor.
//O programa deve então ordenar o vetor em ordem crescente e exibir o vetor ordenado na tela.

        int quantidadeDeNumeros, aux = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("O vetor terá quantas posições: ");
        quantidadeDeNumeros = leia.nextInt();

        int conjuntoNumerico[] = new int[quantidadeDeNumeros];

        for (int i = 0; i < quantidadeDeNumeros; i++){
            System.out.println("Insira o numero da posição " + i + ": ");
            conjuntoNumerico[i] = leia.nextInt();
        }

        for (int i = 0; i < quantidadeDeNumeros - 1; i++){
            for (int j = 0; j < quantidadeDeNumeros - 1; j++){
                if (conjuntoNumerico[j] > conjuntoNumerico[j + 1]){
                    aux = conjuntoNumerico[j];
                    conjuntoNumerico[j] = conjuntoNumerico[j + 1];
                    conjuntoNumerico[j + 1] = aux;
                }
            }
        }

        System.out.println("O vetor inserido em ordem crescente fica: \n");
        for (int i = 0; i < quantidadeDeNumeros; i++){
            System.out.println(conjuntoNumerico[i] + " ");
        }

    }
}

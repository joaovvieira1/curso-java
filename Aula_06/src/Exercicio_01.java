import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

//Faça um programa cujas entradas são o número de elementos de um vetor de
//números inteiros, seguida dos elementos do vetor, seguido de um valor a ser
//procurado no vetor. O programa deve retornar um número inteiro indicando o índice
//da posição do elemento, caso ele tenha sido encontrado, ou o número -1, caso não
//tenha sido encontrado.

        int numeroDeElementos, valorProcurado, indice = -1;
        Scanner leia = new Scanner(System.in);

        System.out.println("O vetor deve ter quantos elementos: ");
        numeroDeElementos = leia.nextInt();

        int numeros[] = new int[numeroDeElementos];

        for (int i = 0; i<numeroDeElementos; i++){
            System.out.println("Entre com o numero na posição " + i + ": ");
            numeros[i] = leia.nextInt();
        }

        System.out.println("Insira o numero que deseja procurar no vetor: ");
        valorProcurado = leia.nextInt();

        for (int i = 0; i < numeroDeElementos; i++){
            if (numeros[i] == valorProcurado){
                indice = i;
            }
        }

        if (indice != -1){
            System.out.println("O valor foi encontrado no vetor! Esta na posição " + indice + " :)");
        }
        else {
            System.out.println("O valor não foi encontrado no Vetor! Erro: " + indice);
        }

    }
}
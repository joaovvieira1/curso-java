import java.util.Scanner;

public class Exercicio_09 {

    public static void main(String[] args) {

//Escreva um programa Java que lê um vetor de números inteiros e verifica se ele contém apenas números pares.
// Se sim, apresente o vetor. Caso não, informe que o vetor não é par.

        int qtdNumeros, contPar = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o tamanho do vetor: ");
        qtdNumeros = leia.nextInt();

        int numeros[] = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Insira o numero sa posição " + i + ": ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++){
            if (numeros[i] % 2 == 0){
                contPar++;
            }
        }

        if (contPar == qtdNumeros){
            System.out.println("Todos os numeros do vetor são par: ");
            for (int i = 0; i < qtdNumeros; i++){
                System.out.println(numeros[i]);
            }
        }
        else {
            System.out.println("O vetor NÃO é Par!");
        }



    }
}

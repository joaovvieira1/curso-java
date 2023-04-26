import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

//Faça um programa para ler N valores inteiros e armazená-los em um vetor. O
//programa deve contar quantos valores pares ele possui e somar os valores ímpares.

        int quantidadeValres, valoresPares = 0, somaImpares = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("O vetor terá quantas posiçõe: ");
        quantidadeValres = leia.nextInt();

       int inteiros[] = new int[quantidadeValres];

       for (int i = 0; i<quantidadeValres; i++){
           System.out.println("Insira o inteiro da posção " + i + ": ");
           inteiros[i] = leia.nextInt();
       }

       for (int i = 0; i < quantidadeValres; i++){
           if (inteiros[i] % 2 == 0){
               valoresPares++;
           }
           else {
               somaImpares = somaImpares + inteiros[i];
           }
       }

        System.out.println("Existem " + valoresPares + " valores pares no Vetor. E a soma de todos os impares da " + somaImpares + "!");

    }
}

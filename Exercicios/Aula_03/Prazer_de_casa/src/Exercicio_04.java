import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

//Crie um algoritmo que o usuário entre com vários números inteiros e positivos e imprima o produto dos números
//ímpares e a soma dos números pares.

        int numero, produto = 1, soma = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um inteiro positivo para comecar, e 0 para finalizar: ");
        numero = leia.nextInt();

        while (numero>0) {
            if (numero % 2 == 0){
                soma = soma + numero;
            }
            else {produto = produto * numero;}

            System.out.println("Digite um inteiro positivo para comecar, e 0 para finalizar: ");
            numero = leia.nextInt();
        }

        System.out.println("O produto dos numeros impares é " + produto);
        System.out.println("A soma dos numeros pares é " + soma);

    }
}

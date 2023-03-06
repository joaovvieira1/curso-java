import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

//Faça um algoritmo que peça um número inteiro e determine se ele e par ou ímpar. Dica: utilize o operador mod (resto da divisão).

        int numero;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira um numero inteiro: ");
        numero = leia.nextInt();

        if (numero%2 == 0){
            System.out.println("O inteiro inserido é par!");
        }
        else {
            System.out.println("O inteiro inserido é impar!");
        }

    }
}

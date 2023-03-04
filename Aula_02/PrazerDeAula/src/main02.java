import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {

//Faça um algoritmo que receba três números inteiros e mostre o maior deles. (Considere que os números sempre serão diferentes)

        int numero01, numero02, numero03;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o primeiro inteiro: ");
        numero01 = leia.nextInt();
        System.out.println("Insira o segundo inteiro: ");
        numero02 = leia.nextInt();
        System.out.println("Insira o terceiro inteiro: ");
        numero03 = leia.nextInt();

        if (numero01>numero02 && numero01>numero03){
            System.out.println("O maior inteiro é o primeiro inserido com o valor de " + numero01);
        }
        else if (numero02>numero01 && numero02>numero03) {
            System.out.println("O maior inteiro é o segundo inserido com o valor de " + numero02);
        }
        else if (numero03>numero01 && numero03>numero02) {
            System.out.println("O maior inteiro é o terceiro inserido com o valor de " + numero03);}
        else {
            System.out.println("Os numeros inseridos são iguais");
        }

    }
}

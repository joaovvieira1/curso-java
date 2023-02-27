import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int num1;
        int num2;
        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor escreva o primeiro numero: ");
        num1 = leia.nextInt();

        System.out.println("Por favor escreva o segundo numero: ");
        num2 = leia.nextInt();


        int soma = num1 + num2;
        int multi = num1 * num2;
        double div = num1 / num2;

        System.out.println("A soma entre os dois valores e " + soma);
        System.out.println("A multipplicação entre os dois valores e " + multi);
        System.out.println("A divisão entre os dois valores e " + div);


        //int idade = 0;

        // Tipos primitivos imteiros:
        // int
        // byte;
        // short;
        // çong;

        //double salario = 10.0;

        // Tipos primitivos c/ ponto flutuante
        // double;
        //float;


        //boolean maiorDeIdade = false;

        // Tipos primitivos lógico/Boleano
        //boolean;

        //char sexo = 'M';
        //Tipo primitivo caractere
        // char;

        //String nome = "Raphael";
        //RAPPER do java para receber palavras


        //System.out.println(idade);
    }
}
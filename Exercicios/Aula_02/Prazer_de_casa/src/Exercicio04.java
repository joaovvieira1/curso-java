import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

//Faça um algoritmo que receba os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. Dicas:
//
//Três lados formam um triangulo quando a soma de quaisquer dos dois lados é maior que o terceiro.
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;

        double lado01, lado02, lado03;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o valor do lado 1: ");
        lado01 = leia.nextDouble();
        System.out.println("Insira o valor do lado 2: ");
        lado02 = leia.nextDouble();
        System.out.println("Insira o valor do lado 3: ");
        lado03 = leia.nextDouble();

        if ((lado01+lado02)>lado03 && (lado01+lado03)>lado02 && (lado02+lado03)>lado01){
            if (lado01 == lado02 && lado02 == lado03){
                System.out.println("O triangulo é equilatero!");
            }
            else if (lado01 != lado02 && lado01 != lado03 && lado02!=lado03) {
                System.out.println("O triangulo é escaleno!");
            }
            else {
                System.out.println("O triangulo é Isosceles!");
            }
        }
        else {
            System.out.println("Não é um triangulo!");
        }

    }
}

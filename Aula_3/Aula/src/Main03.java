import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

//Faça um algoritmo que receba a
//idade de 1 pessoa e mostre essa idade e também o valor que ela deverá pagar, segundo a seguinte tabela:
//
//Idade                                           Valor
//Até 10 anos                          | R$ 30,00
//Acima de 10 até 29 anos    | R$ 60,00
//Acima de 29 até 45 anos    | R$ 120,00
//Acima de 45 até 59 anos   |  R$ 150,00
//Acima de 59 anos               |  R$ 300,00

        int idade;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        idade = leia.nextInt();

        if (idade >=0 && idade < 10){
            System.out.println("Tem de pagar R$ 30,00");
        }
        else if (idade >= 10 && idade <29) {
            System.out.println("Tem de pagar R$ 60,00");
        }
        else if (idade >=29 && idade<45) {
            System.out.println("Tem de pagar R$ 120,00");
        }
        else if (idade >=45 && idade<59) {
            System.out.println("Tem de pagar R$ 150,00");
        } else if (idade>=59) {
            System.out.println("Tem de pagar R$ 300,00");
        } else {
            System.out.println("Idade invalida!");
        }
    }
}

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

//Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

        int idade, contador = 0, maiorDeIdade = 0;
        Scanner leia = new Scanner(System.in);

        for (contador = 0; contador<20;contador++){
            System.out.println("Insira a idade da pessoa numero "+(contador + 1) +": ");
            idade = leia.nextInt();

            if (idade>=18){
                maiorDeIdade++;
            }
        }

        System.out.println("Existem " + maiorDeIdade + " pessoas maiores de idade!");

    }
}

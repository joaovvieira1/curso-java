import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

//Escreva um algoritmo que receba 4 notas de um aluno. Depois calcule a média dessas 4 notas e apresente se o aluno foi:
// - nota maior que 6: Aprovado
// - nota entre 5 e 6: Em recuperação
// - nota menor que  5: Reprovado

        double nota01, nota02, nota03, nota04, media;
        Scanner leia = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        System.out.println("Insira a primeira nota: ");
        nota01 = leia.nextDouble();
        System.out.println("Insira a segunda nota: ");
        nota02 = leia.nextDouble();
        System.out.println("Insira a terceira nota: ");
        nota03 = leia.nextDouble();
        System.out.println("Insira a quarta nota: ");
        nota04 = leia.nextDouble();

        if (nota01 >= 0 && nota02 >= 0 && nota03 >= 0 && nota04 >= 0) {
            media = (nota01 + nota02 + nota03 + nota04) / 4;

            if (media >= 6) {
                System.out.println("Sua media foi de " + dec.format(media) + " . Você foi APROVADO!");
            } else if (media >= 5 && media < 6) {
                System.out.println("Sua media foi de " + dec.format(media) + " . Você esta de RECUPERAÇÃO!");
            } else if (media < 5) {
                System.out.println("Sua media foi de " + dec.format(media) + " . Você esta REPROVADO!");
            }

        }else{System.out.println("Dados invalidos!");}
    }
}
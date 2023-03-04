import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


// Algoritmo que receba 4 notas e verifique se a média é maior ou igual a 6. Se for maior ou igual a seis apresente a mensagem de "Aprovado".
// Se for menor apresente "Reprovado". (Aventureiro:  Se for menor que 6 e maior que 5 então apresente "Recuperação") .

            double nota01, nota02, nota03, nota04, media;
            Scanner leia = new Scanner(System.in);

        System.out.println("Insira o valor da primeira nota: ");
        nota01 = leia.nextDouble();
        System.out.println("Insira o valor da segunda nota: ");
        nota02 = leia.nextDouble();
        System.out.println("Insira o valor da terceira nota: ");
        nota03 = leia.nextDouble();
        System.out.println("Insira o valor da quarta nota: ");
        nota04 = leia.nextDouble();

            media = (nota01 + nota02 + nota03 + nota04)/4;

            if (media>=6){
                System.out.println("O aluno foi aprovado!");
            }
            else if(media<6 && media>5) {
                System.out.println("O aluno esta de recuperação!");
            }
            else {
                System.out.println("O aluno foi reprovado, se esforce mais!");
            }
    }

}
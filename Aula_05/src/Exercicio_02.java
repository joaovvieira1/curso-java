import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

//Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule e imprima a media geral.

        double notas[] = new double[15];
        double mediaDeNotas = 0;
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i <notas.length; i++){
            System.out.println("Digita a nota numero " + (i + 1) + ": ");
            notas[i] = leia.nextDouble();}

        for (int i = 0; i<notas.length; i++){
            mediaDeNotas = mediaDeNotas + notas[i];
        }
         mediaDeNotas = mediaDeNotas/15;

        System.out.println("A media geral da sala foi de " + mediaDeNotas);
    }
}

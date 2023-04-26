import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

//Faça um programa para ler a nota da prova de 15 alunos e armazene num ArrayList, calcule e imprima a media geral.


        double soma = 0, media = 0;
        Scanner leia = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<Double>();

        for (int i = 0; i<15; i++){
            System.out.println("Digite a nota do aluno " + i + ":");
            double nota = leia.nextDouble();
            notas.add(nota);
        }
        for (Double nota : notas){
            soma = soma + nota;
        }

        media = soma / notas.size();
        System.out.println("A media dos alunos foi de " + media);
    }
}
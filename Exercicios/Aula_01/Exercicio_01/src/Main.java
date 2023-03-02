import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//  Ler as 1ª e 2ª  avaliações de um aluno. Calcular a média aritmética simples e escrever
//  uma mensagem: " A média do aluno(a) é:  valor da média "

        double n1, n2, media;
        Scanner leia = new Scanner(System.in);


        System.out.println("Insira a nota da primeira avaliação: ");
        n1 = leia.nextDouble();
        System.out.println("Insira a nota da segunda avaliação: ");
        n2 = leia.nextDouble();

        media = (n1 + n2)/2;

        System.out.println("A média do aluno(a) é: " + media);


    }
}
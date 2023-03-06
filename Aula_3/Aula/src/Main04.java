import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

//Faça um programa que leia dois inteiros, que representam a idade e o tempo de contribuição de um trabalhador e informe se ele pode se aposentar ou não. Os critérios para
//aposentadoria são:
//• Ter pelo menos 65 anos de idade;
//• Ou ter trabalhado pelo menos 30 anos;
//• Ou ter pelo menos 60 anos e trabalhado pelo menos 25.

        int idade, tempoDeContribuicao;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        idade = leia.nextInt();

        System.out.println("Insira o seu tempo de contribuição: ");
        tempoDeContribuicao = leia.nextInt();

        if (idade >= 65 || tempoDeContribuicao >= 30 || (idade>=60 && tempoDeContribuicao>=25) ){
            System.out.println("Você pode dar entrada na aposentasdoria!");
        }
        else {
            System.out.println("Você ainda não atingiu os pré-requisitos!");
        }
    }
}

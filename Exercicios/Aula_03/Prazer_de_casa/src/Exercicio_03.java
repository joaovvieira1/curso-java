import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

//Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

        int contador,idade, idadeMaisNovo = 1000;
        String nome, nomeMaisNovo = null;
        Scanner leia = new Scanner(System.in);

        for(contador = 0; contador<10; contador++){
            System.out.println("Insira o nome da pessoa " + (contador + 1) + ": ");
            nome = leia.next();
            System.out.println("Insira a idade da pessoa " + (contador + 1) + ": ");
            idade = leia.nextInt();

            if (idade<idadeMaisNovo){
                idadeMaisNovo = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println(nomeMaisNovo+ " é a pessoa mais nova!");

    }
}

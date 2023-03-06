import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

//Faça um algoritmo que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre o mais barato.

        double produtoNumero01, produtoNumero02, produtoNumero03;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o preço do primeiro produto: ");
        produtoNumero01 = leia.nextDouble();
        System.out.println("Insira o preço do segundo produto: ");
        produtoNumero02 = leia.nextDouble();
        System.out.println("Insira o preço do terceiro produto: ");
        produtoNumero03 = leia.nextDouble();
        if (produtoNumero01>0 && produtoNumero02>0 && produtoNumero03>0) {
            if (produtoNumero01 < produtoNumero02 && produtoNumero01 < produtoNumero03) {
                System.out.println("Você deve comprar o primeiro produto!");
            } else if (produtoNumero02 < produtoNumero01 && produtoNumero02 < produtoNumero03) {
                System.out.println("Você deve comprar o segundo produto!");
            } else if (produtoNumero03 < produtoNumero01 && produtoNumero03 < produtoNumero02) {
                System.out.println("Você deve comprar o Terceiro produto!");
            } else {
                System.out.println("O valor dos produtos são iguais, compre qualquer um!");
            }
        }
        else {
            System.out.println("Inserção de dados invalida");
        }

    }
}
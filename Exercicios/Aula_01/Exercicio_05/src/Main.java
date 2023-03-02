import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
//escrever o saldo atual (saldo atual = saldo - débito + crédito)

        int nc;
        double sd, de, cre;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o numero da conta: ");
        nc = leia.nextInt();

        System.out.println("Insira o saldo da conta: ");
        sd = leia.nextDouble();
        System.out.println("Insira o valor dos debitos: ");
        de = leia.nextDouble();
        System.out.println("Insira o valor de credito: ");
        cre = leia.nextDouble();

        sd = sd - de + cre;

        System.out.println("o Saldo atual é de " + sd + "!");

    }
}
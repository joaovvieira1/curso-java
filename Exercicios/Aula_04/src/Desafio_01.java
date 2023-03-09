import java.util.Scanner;

public class Desafio_01 {
    public static void main(String[] args) {

// Sequência de Fibonacci: crie um programa que gera a sequência de Fibonacci até um determinado número n,
// em que cada número é a soma dos dois anteriores (1, 1, 2, 3, 5, 8, 13, ...).
// O programa deve usar um laço de repetição para gerar a sequência.

        int n = 0, contador = 0, x = 1, y = 0, aux = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira até qual numero de Fibonacci você deseja gerar: ");
        n = leia.nextInt();

        for (contador = 0; contador < n; contador++){
            System.out.println(x);
            aux = x;
            x = x + y;
            y = aux;
        }

    }
}
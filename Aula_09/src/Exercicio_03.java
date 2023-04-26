import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

//Receber 15 números em um array e inverter a ordem dos elementos armazenando em outro de um ArrayList.

        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> numerosInvertidos = new ArrayList<Integer>();

        for (int i = 0; i < 15; i++){
            System.out.println("Insira o numero na posição " + i + ": ");
            int numero = leia.nextInt();
            numeros.add(numero);
        }

        for (int i = numeros.size() - 1 ; i >= 0; i--){
            numerosInvertidos.add(numeros.get(i));
        }

        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println("Sequencia dos numeros inseridos: " + numeros );
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println("Sequencia dos numeros invertidos: " + numerosInvertidos );
        System.out.println();
        System.out.println("---------------------------------------------------------");

    }
}

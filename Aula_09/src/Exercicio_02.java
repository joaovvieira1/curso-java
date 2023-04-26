import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

//Receber 15 números em um VETOR .
// Depois armazenar os valores impares em uma LISTA de números impares,
// e o pares e uma LISTA de números pares. IMPRIMA OS VETORES ANIMAL

        Scanner leia = new Scanner(System.in);
        int numeros[] = new int[15];
        ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Insira o numero da posição " + i + ": ");
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0 ){
                numerosPares.add(numeros[i]);
            }
            else {
                numerosImpares.add(numeros[i]);
            }
        }

        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println("Numeros Impares: " + numerosImpares );
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println("Numeros Pares: " + numerosPares );
        System.out.println();
        System.out.println("---------------------------------------------------------");
    }
}

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

//Receber 15 numeros em um vetor. Depois armazenar os valores impares
// em um vetor de numeros impares, e o pares e um vetor de numeros pares. IMPRIMA OS VETORES ANIMAL

        int numeros[] = new int[5], quantidadeDeImpares = 0, numerosImpare[] = new int[5], quantidadeDePares = 0, numerosPares[] = new int[5];
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i<numeros.length; i++){
            System.out.println("Insira o inteiro da posição " + i);
            numeros[i] = leia.nextInt();
        }

        for (int i = 0; i<numeros.length; i++){
            if (numeros[i] % 2 == 0) {
                numerosPares[quantidadeDePares] = numeros[i];
                quantidadeDePares++;
            }
            else {
                numerosImpare[quantidadeDeImpares] = numeros[i];
                quantidadeDeImpares++;}}

        System.out.println("Numeros pares: ");
        for (int i = 0; i<numeros.length; i++){
            System.out.println(numerosPares[i] + " ");
        }
        System.out.println("Numeros impares: ");
        for (int i = 0; i<numeros.length; i++){
            System.out.println(numerosImpare[i] + " ");
        }


    }
}

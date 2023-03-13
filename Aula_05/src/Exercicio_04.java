import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

//Ler oito elementos inteiros em uma matriz unidimensional (A). Construir uma matriz B de
//mesma dimensão com os elementos da matriz A multiplicados por 3. Após, apresente
//os números da matriz B
//
//Exemplo:
//vetorA[0] = 1;
//vetorB[0] = vetorA[0] * 3;
//resultado: vetor[0] // 3

        int matrizA [] = new int[8];
        int matrizB [] = new int[8];
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i<matrizA.length; i++){
            System.out.println("Insira o inteiro da posição " + i + ": ");
            matrizA[i] = leia.nextInt();
        }

        for (int i = 0; i<matrizB.length; i++){
            matrizB[i] = matrizA[i] * 3;
        }

        for (int i = 0; i<matrizB.length; i++){
            System.out.println("Valor da posição " + i + " multipplicado por 3: " + matrizB[i]);
        }

    }
}

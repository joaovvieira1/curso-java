import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

//Escreva um programa Java que lê dois vetores de números inteiros e exibe o vetor resultante da união entre eles
// (ou seja, todos os números que aparecem em pelo menos um dos vetores).

        int qtdNumeros01 = 0, qtdNumeros02 = 0, aux = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas posições terá o primeiro vetor: ");
        qtdNumeros01 = leia.nextInt();

        int vetor01[] = new int[qtdNumeros01];

        for (int i = 0; i < qtdNumeros01; i++){
            System.out.println("Insira o numero na posição " + i + " do primeiro vetor: ");
            vetor01[i] = leia.nextInt();
        }

        System.out.println("Quantas posições terá o segundo vetor: ");
        qtdNumeros02 = leia.nextInt();

        int vetor02[] = new int[qtdNumeros02];

        for (int i = 0; i < qtdNumeros02; i++){
            System.out.println("Insira o numero na posição " + i + " do segundo vetor: ");
            vetor02[i] = leia.nextInt();
        }

        int uniao[] = new int[qtdNumeros01 + qtdNumeros02];

        for (int i = 0; i < qtdNumeros01; i++){
            uniao[aux] = vetor01[i];
            aux++;
        }

        for (int i = 0; i < qtdNumeros02; i++){
            int j;
            for (j = 0; j < qtdNumeros01; j++){
                if (vetor01[i] == vetor02[j]){
                    break;
                }
            }
            if (j == qtdNumeros01){
                uniao[aux] = vetor02[i];
                aux++;
            }
        }

        System.out.println("A união entre os dois vetores é: ");
        for (int i = 0; i < aux; i++){
            System.out.println(uniao[i] + " ");
        }



    }
}

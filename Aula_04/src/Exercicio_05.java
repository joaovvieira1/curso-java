import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {

//Uso de elevadores em um prédio!
//Em um prédio com 50 moradores há três elevadores denominados A, B e C.
// Para otimizar o sistema de controle dos elevadores, desenvolva um programa em que cada morador informa
// qual o elevador que utiliza com mais freqüência (A, B ou C).
// O programa deve contabilizar o total de pessoas que usa cada um dos elevadores e mostrar estes totais no final.

        int contador = 0, elevador = 0, elevadorA = 0, elevadorB = 0, elevadorC = 0;
        Scanner leia = new Scanner(System.in);

        for (contador = 0; contador < 50; contador++){
            System.out.println("Insira o elevador que mais utiliza (1 - para elevador A, 2 - para elevador B e 3 - pata elevador C): ");
            elevador = leia.nextInt();

            if (elevador == 1){
                elevadorA++;}
            else if (elevador == 2) {
                elevadorB++;}
            else if (elevador == 3) {
                elevadorC++;}
            else {
                System.out.println("Insirção de opção invalida, insira mais uma vez e de forma correta!");
                contador--;}
        }

        System.out.println("Total de usuarios do elevador A: " + elevadorA);
        System.out.println("Total de usuarios do elevador B: " + elevadorB);
        System.out.println("Total de usuarios do elevador C: " + elevadorC);
      }}

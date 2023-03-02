import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

        int hi, hf, dur;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira a hora de inicio do jogo: ");
        hi = leia.nextInt();

        System.out.println("Insira a hora de termino do jogo: ");
        hf = leia.nextInt();

        if (hi>hf){
            dur = 24 - hi + hf;
        }
        else {
            dur = hf - hi;
        }

        System.out.println("A duração do jogo foi de " + dur);

    }
}
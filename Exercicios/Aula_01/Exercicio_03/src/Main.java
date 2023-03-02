import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// Tendo como dado de entrada a altura de uma mulher, calcule
// e mostre seu peso ideal, utilizando a seguinte fórmula:
//             peso ideal = (62.1 * altura) - 44.7
//
// Exiba na tela o resultado final. OBS: esse exercicio não é pra ser feito com variavel do tipo int

        double alt, pi;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira a altura da mulher em metros para estimar o peso ideal: ");
        alt = leia.nextDouble();
        pi = (62.1 * alt) - 44.7;
        System.out.println("O peso ideal estimado para essa mulher é " + pi);



    }
}
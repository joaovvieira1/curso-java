import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//   Tendo como dado de entrada a altura de um homem, calcule
//   e mostre seu peso ideal, utilizando a seguinte fórmula:
//             peso ideal = (72.7 * altura) - 58
//
//   Exiba na tela o resultado final. OBS: esse exercicio não é pra ser feito com variavel do tipo int

        double alt, pi;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira sua altura em metros para estimar seu peso ideal: ");
        alt = leia.nextDouble();
        pi = (72.7 * alt) - 58;
        System.out.println("Seu peso ideal estimado é: " +pi);
//
    }
}
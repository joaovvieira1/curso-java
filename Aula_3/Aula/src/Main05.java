import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {

//Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
//multiplicação até 50.


        double numeroDeEntrada, numeroDeSaida;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira um numero para saber sua tabuada de multiplicação até 50: ");
        numeroDeEntrada = leia.nextInt();

        for (int contador = 0; contador<51; contador++ ){

            numeroDeSaida = contador * numeroDeEntrada;
            System.out.println(contador + " X " + numeroDeEntrada + " = " + numeroDeSaida);

        }

    }
}

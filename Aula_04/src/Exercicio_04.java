import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

//Faça um algoritmo que simule uma calculadora. O algoritmo deve permitir que eu faça mais de um calculo antes de encerrar,
// ou seja apresente a opção para que o usuário encerre a calculadora. Ex:
//Selecione uma opção:
//1 - SOMAR
//2 - SUBTRAIR
//3 -  MULTIPLICAR
//4 - DIVIDIR
//0 - ENCERRAR CALCULADORA;
//
//Obs: Não permita que haja divisão por 0; Para calcular receba sempre dois números!

        int opcao;
        double primeiroNumero = 0, segudoNumero = 0, soma = 0, subtracao = 0, multiplicacao = 0, divisao = 0;
        Scanner leia = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        do {
            System.out.println("1 - SOMAR \n 2 - SUBTRAIR \n 3 - MULTIPLICAR \n 4 - DIVIDIR \n 0 - ENCERRAR \n" );
            opcao = leia.nextInt();

            if (opcao > 0 && opcao <5){
                System.out.println("Digite o primeiro valor: ");
                primeiroNumero = leia.nextDouble();
                System.out.println("Digite o segundo valor: ");
                segudoNumero = leia.nextDouble();
            }

            switch (opcao){
                case 0:
                    System.out.println("Encerrando aplicativo... ");
                    break;
                case 1:
                    soma = primeiroNumero + segudoNumero;
                    System.out.println("Soma: " + dec.format(soma));
                    break;
                case 2:
                    subtracao = primeiroNumero - segudoNumero;
                    System.out.println("Subtração: " + dec.format(subtracao));
                    break;
                case 3:
                    multiplicacao = primeiroNumero * segudoNumero;
                    System.out.println("Multiplicação> " + dec.format(multiplicacao));
                case  4:
                    if (primeiroNumero>0 && segudoNumero>0){
                        divisao = primeiroNumero/segudoNumero;
                        System.out.println("divisão: " + dec.format(divisao));
                        break;
                    }
                    else {
                        System.out.println("Inserção de dados invalidos!");
                        break;
                    }

            }

        } while (opcao != 0);

    }
}

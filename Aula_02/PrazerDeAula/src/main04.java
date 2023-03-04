import java.util.Scanner;

public class main04 {
    public static void main(String[] args) {

//Construa um algoritmo que possa calcular a área de objetos geometricos (quadradro/retangulo/circulo).
// Faça com que o usuario informe primeiro qual a forma ele quer calcular e depois receba os valores necessários e realize o calculo.
//
//ex:
//Digite 1 para calcular a area do quadrado; area = lado*lado
//Digite 2 para calcular a area do retangulo; area = base*altura
//Digite 3 para calcular a area do circulo;  area = 3.14 * (raio * raio)
//Qualquer outra opção escreva "Opção inválida"

        double area, lado, base, altura, raio;
        int opcao;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 1 para calcular a area do quadrado");
        System.out.println("Digite 2 para calcular a area do retangulo");
        System.out.println("Digite 3 para calcular a area do circulo");

        opcao = leia.nextInt();

        if (opcao == 1){
            System.out.println("Insira o valor do lado do quadrado: ");
            lado = leia.nextDouble();
            area = lado * lado;
            System.out.println("O valor da area do quadrado é " + area);
        }
        else if (opcao == 2) {
            System.out.println("Insira o valor da base do retangulo: ");
            base = leia.nextDouble();
            System.out.println("Insira o valor da altura do retangulo: ");
            altura = leia.nextDouble();

            area = base * altura;

            System.out.println("O valor da area do retangulo é " + area);
        }
        else if (opcao == 3) {
            System.out.println("Insira o valor do raio do circulo: ");
            raio = leia.nextDouble();

            area = 3.14 * (raio * raio);

            System.out.println("O valor da area do circulo é " + area);

        }
        else {
            System.out.println("Opção invalida!");
        }
    }
}

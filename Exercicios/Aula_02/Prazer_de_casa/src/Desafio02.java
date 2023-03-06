import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

//a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual;
//b. Salários até R$ 280,00 (incluindo): aumento de 20%;
//c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
//d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
//e. Salários de R$ 1500,00 em diante: aumento de 5%
//
//Após o aumento ser realizado; informe na tela;
//
//a. O salário antes do reajuste;
//b. O percentual de aumento aplicado;
//c. O valor do aumento;
//d. O novo salário, após o aumento.

        double salario, reajuste=0, aumento=0;
        int percentual=0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o seu salario: ");
        salario = leia.nextDouble();

        if (salario<=280){
            aumento = (salario/100)*20;
            reajuste = salario + aumento;
            percentual = 20;
        }
        else if (salario>280&&salario<=700) {
            aumento = (salario/100)*15;
            reajuste = salario + aumento;
            percentual = 15;
        }
        else if (salario>700&&salario<=1500) {
            aumento = (salario/100)*10;
            reajuste = salario + aumento;
            percentual = 10;
        }
        else if (salario>1500) {
            aumento = (salario/100)*5;
            reajuste = salario + aumento;
            percentual = 5;
        }

        System.out.println("O salario antes do reajuste era "+salario);
        System.out.println("Teve um percentual de aumento de " + percentual + "%. No valor de " +aumento );
        System.out.println("O salario reajustado fica em R$ " + reajuste);
    }
}

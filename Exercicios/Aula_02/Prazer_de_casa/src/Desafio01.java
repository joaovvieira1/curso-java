import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {

//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda,
// que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário bruto,
// mas não é descontado (é a empresa que deposita.)
//
//O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor da sua hora e a quantidade
// de horas trabalhadas no mês.
//
//a. Desconto do IR;
//b. Salário Bruto ate R$900,00 (inclusive) – Isento;
//c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
//d. Salario bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
//e. Salário bruto acima de 2500 – Desconto de 20%.
//
//Imprima na tela as informações, dispostas conforme o exemplo abaixo, no exemplo valor da hora é 5 e a quantidade de horas é 220.
//
//Salário bruto (5 * 220)           : R$   1100,00
//( – ) IR (5%)                                    : R$     55,00
//( – ) INSS ( 10% )                          : R$     110,00
//FGTS ( 11%)                                   : R$     121,00
//Total de descontos                    : R$     165,00
//Salário Líquido                           : R$     935,00

        double salarioBruto, impostoDeRenda = 0, sindicato, fgts, inss, salarioLiquido, totalDesconto, valorHora, horasTrabalhadas;
        int porcentagem = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o valor da sua hora: ");
        valorHora = leia.nextDouble();
        System.out.println("Insira o numero de horas trabalhadas: ");
        horasTrabalhadas = leia.nextDouble();

        salarioBruto = valorHora * horasTrabalhadas;
        fgts = (salarioBruto/100)*11;
        sindicato = (salarioBruto/100)*3;
        inss = (salarioBruto/100)*10;

        if(salarioBruto<=900){
            impostoDeRenda = 0;
            porcentagem = 0;
        }
        else if (salarioBruto>900 && salarioBruto<=1500) {
            impostoDeRenda = (salarioBruto/100)*5;
            porcentagem = 5;
        }
        else if (salarioBruto>1500 && salarioBruto<=2500) {
            impostoDeRenda = (salarioBruto/100)*10;
            porcentagem = 10;
        }
        else if (salarioBruto>2500) {
            impostoDeRenda = (salarioBruto/100)*20;
            porcentagem = 20;
        }
        totalDesconto = impostoDeRenda + inss + sindicato;
        salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Salario bruto (" + valorHora +"*"+horasTrabalhadas + ")          :R$"+salarioBruto);
        System.out.println("(-) IR ("+porcentagem+"%)                        :R$  "+impostoDeRenda);
        System.out.println("(-) INSS (10%)                      :R$  "+inss);
        System.out.println("(-) Sindicato (3%)                  :R$  "+sindicato);
        System.out.println("FGTS (11%)                          :R$  "+fgts);
        System.out.println("Total de descontos                  :R$  "+totalDesconto);
        System.out.println("Salario liquido                     :R$  "+salarioLiquido);
    }
}

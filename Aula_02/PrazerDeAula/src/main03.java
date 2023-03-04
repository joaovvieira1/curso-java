import java.util.Scanner;

public class main03 {
    public static void main(String[] args) {

//DESAFIO: Construa um algoritmo que leia o código de um determinado produto e mostre a sua classificação.
//
//Código Classificação
//1 - Alimento não-perecível
//2, 3 ou 4 - Alimento perecível
//5 ou 6 - Vestuário
//7 - Higiene pessoal
//8, 9, 10 - Utensílios domésticos
//Qualquer outro código Inválido

        int codigo;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o codigo para verificar a classificação: ");
        codigo = leia.nextInt();

        if (codigo == 1){
            System.out.println("Alimento não perecivel");
        }
        else if (codigo>=2 && codigo<=4) {
            System.out.println("Alimento perecivel");
        }
        else if (codigo>=5 && codigo<=6) {
            System.out.println("Vestuario");
        }
        else if (codigo == 7) {
            System.out.println("Higiene Pessoal");
        }
        else if (codigo>=8 && codigo<=10) {
            System.out.println("Utensilios domesticos");
        }
        else{System.out.println("Codigo invalido!");}

    }
}

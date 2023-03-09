import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

// Foi feita uma pesquisa entre os habitantes de uma região e coletados os dados de altura e sexo (0=masc, 1=fem)
//das pessoas. Faça um programa que leia 50 dados diferentes e informe:
//- a maior e a menor altura encontradas;
//- a média de altura das mulheres;
//- a média de altura da população;

        int contador = 0, sexo, contadorMulher = 0;
        double altura, alturaMaior = 0, alturaMenor = 1000, mediaAltura = 0, mediaAlturaMulher = 0;
        Scanner leia = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        for (contador = 0; contador<50; contador++){
            System.out.println("Informe sua altura em metros (Ex: 1,73): ");
            altura = leia.nextDouble();
            System.out.println("Informe o sexo (0 = masculino, 1 = Feminino): ");
            sexo = leia.nextInt();

            if (altura>alturaMaior){alturaMaior=altura;} else if (altura<alturaMenor) {alturaMenor = altura;}
            if(sexo==1){
                contadorMulher++;
                mediaAlturaMulher = mediaAlturaMulher + altura;}

            mediaAltura = mediaAltura +altura;

        }
        mediaAltura = mediaAltura/contador;
        mediaAlturaMulher = mediaAlturaMulher/contadorMulher;

        System.out.println("A maior altura foi de " + dec.format(alturaMaior) + " e a menor altura foi de " + dec.format(alturaMenor) + "!");
        System.out.println("Teve um total de " + contadorMulher + " mulhere(s), totalizando uma media de " + dec.format(mediaAlturaMulher) + "!");
        System.out.println("A media de altura da população no geral foi de " + dec.format(mediaAltura) + "!");


    }
}

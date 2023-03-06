public class Main {
    public static void main(String[] args) {

        int contador = 0;
        System.out.println("\n Do - While \n");
        do {
            System.out.println(contador);
            contador++;
        }while (contador<101);

        System.out.println("\n While \n");

     contador = 0;

    while(contador<101){
        System.out.println(contador);
        contador++;
    }
        System.out.println("\n For \n");

    for(contador = 0; contador<101; contador++){
        System.out.println(contador);
    }
}}
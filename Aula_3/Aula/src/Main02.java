public class Main02 {
    public static void main(String[] args) {
        int contador = 100;
        System.out.println("\n Do - While \n");
        do {
            System.out.println(contador);
            contador--;
        }while (contador!=-1);

        System.out.println("\n While \n");

        contador = 100;

        while(contador!=-1){
            System.out.println(contador);
            contador--;
        }
        System.out.println("\n For \n");

        for(contador = 100; contador!=-1; contador--){
            System.out.println(contador);
        }
    }
}

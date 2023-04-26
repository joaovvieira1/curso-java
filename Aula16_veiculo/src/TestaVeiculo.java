public class TestaVeiculo {
    public static void main(String[] args) {

        DePasseio hb20 = new DePasseio(4,2022,"Preto","PAU6789",4,"Hyundai",6);
        Moto hornet = new Moto(2,2022,"Vermelha","PAU4536",600);
        Caminhao volvo = new Caminhao(6,2022,"Branco","PAU6678",2);

        System.out.println(hb20);
        System.out.println(hornet);
        System.out.println(volvo);


    }
}
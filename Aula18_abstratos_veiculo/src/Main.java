public class Main {
    public static void main(String[] args) {

        DePasseio hb20 = new DePasseio("PAZ3454",2022,"Preto",89.987,new Proprietario("02199649121","Joao Victor",new Endereco("QNM 40 Conjunto O","27")),"Hyundai","Carro popular com caa de Bagre",new Montadora("56345326345635","Hyubdai LTDA",new Endereco("QNM 456 Lote 1 a 14","12")));
        Onibus man = new Onibus("PAC4567",2022,"Preto", 260000.89,new Proprietario("02278965432","Wallison Robert",new Endereco("QNN 12 Conjunto B","17")),48,new Montadora("56453675367536","Volkswagen",new Endereco("SQWT 6 Quadra 18","Lote 1 a 8")));
        Moto iron883 = new Moto("PAZ8974",2022,"Vermelha",53300,new Proprietario("98767854312","Gabriel",new Endereco("QNM 38 Conjunto G","41")),883);

        System.out.println(hb20);
        System.out.println(man);
        System.out.println(iron883);



    }
}
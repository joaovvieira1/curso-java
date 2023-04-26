public class TestaCachorro {
    public static void main(String[] args) {


        Proprietario dono = new Proprietario("Joao", "QNM 40 Conjunto O",new Filiacao("Sergio Luis", "Alessandra"));
        Filiacao pedigree = new Filiacao("Chitanzinho","Chororo");
        Cachorro pet = new Cachorro("435678543", "Marrone", "Golden",dono,pedigree);

        System.out.println(pet);

    }
}
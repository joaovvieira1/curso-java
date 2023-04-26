public class TestaPessoa {
    public static void main(String[] args) {


        Cliente cl = new Cliente("91991991999","Jefin",
                new Endereco("QNadaMaria",23),65.7,114,
                new Internet("OI",6.6),
                new Impressao("Colorida",1.15));
        Tecnico tc = new Tecnico("01002303455","Juares Betialo",
                new Endereco("QTudoGabriel",69),"000435353",765.78,
                new Equipamento("Intel","Processor developer"));
        Funcionario fc = new Funcionario("91991991999", "Maria",
                new Endereco("QNadaMaria",23), 23,50.5);



        System.out.println(cl);
        System.out.println();
        System.out.println(tc);
        System.out.println();
        System.out.println(fc);;

    }
}
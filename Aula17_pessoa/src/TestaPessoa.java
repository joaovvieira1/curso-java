public class TestaPessoa {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica01 = new PessoaFisica("João Victor Vieira","QNM 40 Conjunto O",23,"02199649121");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("AV Agro","Goiatuba-GO",4,"637345375347353");
        DeVeiculos vendedor01 = new DeVeiculos("Jorge","Qnm 17 conjunto P",452346524,4600.78,23);
        DeMoveis vendedor02 = new DeMoveis("Leticia","QNM 24 Conkunto T",543647353,17000.8,"LeMoveis","Premium",9.6);
        Fornecedor fornecedor = new Fornecedor("Premia Moveis","SQW04 Lote 13","637523735763","Brasil");

        System.out.println(pessoaFisica01);
        System.out.println(pessoaJuridica);
        System.out.println(vendedor01);
        System.out.println(vendedor02);
        System.out.println(fornecedor);

    }
}
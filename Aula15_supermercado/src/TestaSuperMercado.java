public class TestaSuperMercado {
    public static void main(String[] args) {

        Supermercado martinez = new Supermercado("0000000000","Martinez LTDA","61933445566",new Produto("3456", "Sabonete", 2.99, new Fornecedor("8765434", "LimposDF", "080022222", new Endereco("Amadora", "45", new Cep("72150500")))),new Endereco("Qnm 38/36", "38", new Cep("72100000")),new Cliente("000.555.000-55", "Maria", 47, new Endereco("Asa Norte", "701", new Cep("123456")), new Produto("989898", "Pasta de Dente", 3.99, new Fornecedor("09090909", "PastaDent", "61661616161", new Endereco("Asa norte", "107", new Cep("72156666"))))));
        System.out.println(martinez);

    }
}
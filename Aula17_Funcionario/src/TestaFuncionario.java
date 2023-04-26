public class TestaFuncionario {
    public static void main(String[] args) {

        Vendedor ven01 = new Vendedor(234234242,"João Victor Vieira",23567.78,
                new Endereco("QNM 24 Conjunto O",14),7.78,
                new Venda("23-05-2022",234000.56,
                        new FormaPagamento("53643634363","Credito"),
                        new Acessorio(4536,"RTX3060",2349.90,
                                new Fornecedor("435436426436","Pichau",
                                        new Endereco("São Paulo",500))),
                        new Peca(13425,"RTX3050",1647.90,
                                new Fornecedor("6352375267215","Terabyte",
                                        new Endereco("São Paulo",499)))));

        Mecanico mec01 = new Mecanico(54364536,"Paulão",3500.00,
                new Endereco("São Palo",498),4.0);

        Atendente atn01 = new Atendente(676453,"Sofia",1499.99,
                new Endereco("São Paulo",497),90);


        System.out.println(ven01);
        System.out.println(mec01);
        System.out.println(atn01);

    }
}
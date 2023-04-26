public class TestaFuncionario {
    public static void main(String[] args) {

    Loja loja = new Loja("8373983648367",
            new Tv("7363873653786373",563.78,
                    new NotaFiscal("Plasma",43542,671.78),32),
            new Piscina("fibra",3456.65,
                    new NotaFiscal("45354365367",65353,3456.66),10000),
            new Arcondicionado("inverter",1300.99,
                    new NotaFiscal("4352348",5346724,1300.99),9000),
            new Atendente("Maria", "123456789", 1, 5, 1500.00,
                    new Contracheque(1, "01/01/2011"), "sim"),
            new Gerente("Maria", "123456789", 1, 5, 2500.00,
                    new Contracheque(1, "01/01/2011"), "Móveis"),
            new Cliente("Maria", "123456789", 1, "(12)33333333"));


    Servico servico = new Servico(100.00, "Balanceamento",
            new Agendamento("08:00", "Asa Sul",
                    new Atendente("Maria", "123456789", 1, 5, 1500.00,
                            new Contracheque(1, "01/01/2011"), "sim")),
            new Mecanico("José", "123456789", 1, 5, 1500.00,
                    new Contracheque(1, "01/01/2011"), "sim"),
            new Cliente("Maria", "123456789", 1, "(12)33333333"),
            new NotaFiscal("01/01/2011", 1, 70.00));


    DePasseio dePasseio = new DePasseio("Fiat", "jjj111", "Branco",47695.65, servico , 4,
            new Acessorio("roda", 68.00));

    Onibus onibus = new Onibus("Fiat", "jjj111", "Branco",25400.15, servico, 30);

        Produto.preco = 1000.00;
        Veiculo.valor = 30000.00;

        System.out.println(loja);
        System.out.println();
        System.out.println(dePasseio);
        System.out.println();
        System.out.println(onibus);
    }
}
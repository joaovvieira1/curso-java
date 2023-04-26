public class TesteUniversidade {
    public static void main(String[] args) {


        Endereco logradura = new Endereco("Brasilia", "Ceilandia","73478512");
        Universidade instituicao = new Universidade("Stanford",logradura);
        Aluno aluno01 = new Aluno("João Victor", 201722062, new Endereco("Brasilia","Asa- norte","79156022"));
        instituicao.getListaDeAlunos().add(aluno01);
        System.out.println(instituicao);

}}
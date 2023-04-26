public class TestaLivro {
    public static void main(String[] args) {

        Livro l1 = new Livro("Biblia",1000,new Edicao(22,1680,new Patrocinador("Paulo",new Endereco("Jerusale",7),new Editora("7654389","Catolic arts",new Endereco("Jerusalem",777)))));
        System.out.println(l1);
    }
}
public class Aluno extends Pessoa{

    private String curso;


    public Aluno(){}

    public Aluno(String curso) {
        this.curso = curso;
    }

    public Aluno(String codigo, String nome, int idade, String curso) {
        super(codigo, nome, idade);
        this.curso = curso;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    @Override
    public String toString() {
        return "Aluno:\n" +
                "curso = " + curso + '\n' +
                "aluno = "+ this.getNome() +"\n"+
                "idade = " + this.getIdade() + "\n"+
                "codigo = "+ this.getCodigo() +"\n";
    }
}

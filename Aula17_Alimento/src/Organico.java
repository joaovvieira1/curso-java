public class Organico extends Alimento{

    private String nomeProdutor;


    public Organico(){}
    public Organico(String dataValidade, double preco, String nome, String nomeProdutor) {
        super(dataValidade, preco, nome);
        this.nomeProdutor = nomeProdutor;
    }


    public String getNomeProdutor() {
        return nomeProdutor;
    }

    public void setNomeProdutor(String nomeProdutor) {
        this.nomeProdutor = nomeProdutor;
    }
}

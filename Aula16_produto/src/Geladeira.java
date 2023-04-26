public class Geladeira extends Produto {

    private String marca;
    private int capacidadeDeLitros;


    public Geladeira(){}
    public Geladeira(String codBarra, String nome, String preco, String marca, int capacidadeDeLitros) {
        super(codBarra, nome, preco);
        this.marca = marca;
        this.capacidadeDeLitros = capacidadeDeLitros;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeDeLitros() {
        return capacidadeDeLitros;
    }

    public void setCapacidadeDeLitros(int capacidadeDeLitros) {
        this.capacidadeDeLitros = capacidadeDeLitros;
    }


    @Override
    public String toString() {
        return "Geladeira: \n" +
                "Codigo de Barra = " + this.getCodBarra() + "\n" +
                "Nome = " + this.getNome() + "\n" +
                "preço = " + this.getPreco() + "\n" +
                "marca = " + marca + '\n' +
                "Capacidade De Litros = " + capacidadeDeLitros;
    }
}

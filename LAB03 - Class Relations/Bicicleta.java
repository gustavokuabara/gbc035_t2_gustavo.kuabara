public class Bicicleta{

    private String nome;
    private Quadro quad;

    public Bicicleta(String nome, Quadro quad){
        this.nome = nome;
        this.quad = quad;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Quadro getQuadro() {
        return quad;
    }

    public void setQuadro(Quadro quad) {
        this.quad = quad;
    }
}
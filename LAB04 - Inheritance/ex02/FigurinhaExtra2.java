public class FigurinhaExtra2 extends Lab06Figurinha2{
    private String categoria;
    private String cor;


    public FigurinhaExtra2(String nome, String dataNasc, double altura, double peso, String posicao, String pais, String categoria, String cor) {
        super(nome, dataNasc, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
    }
    
    //Legends e Rookies
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    //bordô, bronze, prata e ouro
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCategoria(String categoria){
        return this.categoria;
    }

    public String getCor(String cor){
        return this.cor = cor;
    }

    public void MostrarFigurinhaExtra() {
        super.MostrarFigurinha();
        System.out.println("\n--Categoria: " + this.categoria);
        System.out.println("\n--Cor: " + this.cor);
    }
}

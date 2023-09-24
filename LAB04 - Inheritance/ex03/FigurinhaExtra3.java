public class FigurinhaExtra3 extends Lab06Figurinha3{
    private String categoria;
    private String cor;


    public FigurinhaExtra3(Lab06Figurinha3 figurinha,String categoria, String cor){
        super(figurinha.nomeJogador, figurinha.dataNasc, figurinha.altura, figurinha.peso, figurinha.posicao, figurinha.pais);
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

public class FigurinhaExtra{
    private String categoria;
    private String cor;
    private Lab06Figurinha figurinha;

    public FigurinhaExtra(String categoria, String cor, Lab06Figurinha figurinha){
        this.categoria = categoria;
        this.cor = cor;
        this.figurinha = figurinha;
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
        figurinha.MostrarFigurinha();
        System.out.println("\n--Categoria: " + this.categoria);
        System.out.println("\n--Cor: " + this.cor);
    }
}

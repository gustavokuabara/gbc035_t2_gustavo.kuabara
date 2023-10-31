public class Servico implements Classificavel{
    private double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public int compare(Classificavel a){
        Servico compara = (Servico) a;
        return Double.compare(this.preco, compara.preco);
    }

    public double getPreco(){
        return preco;
    }
}

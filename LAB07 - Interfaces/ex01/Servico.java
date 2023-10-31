public class Servico implements Classificavel{
    private double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public boolean eMenorQue(Classificavel a){
        Servico compara = (Servico) a;
        return this.preco < compara.preco;
    }

    public double getPreco(){
        return preco;
    }
}
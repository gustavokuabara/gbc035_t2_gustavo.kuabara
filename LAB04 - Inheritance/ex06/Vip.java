public class Vip extends Ingresso{
    private double valorAdicional;
    private double valorTotal;

    public Vip(double valor, double valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void setValorAdicional(double valorAdicional){
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional(){
        return valorAdicional;
    }

    public void escreveValorVip(){
        valorTotal = super.getValor() + valorAdicional;
        System.out.println("Valor do Ingresso: " + valorTotal);
    }
}

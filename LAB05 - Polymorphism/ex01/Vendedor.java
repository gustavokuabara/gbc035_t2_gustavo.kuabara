class Vendedor extends Funcionario{
    private double valorFixo;
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNasc, double valorFixo, double comissao, double vendas){
        super(nome, dataNasc, 0); 
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    @Override
    public double getSalario() {
        return valorFixo + comissao * vendas;
    }

    
    public void setValorFixo(double valorFixo){
        this.valorFixo = valorFixo;
    }

    public double getValorFixo(){
        return valorFixo;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
    }

    public double getComissao(){
        return comissao;
    }

    public void setVendas(double vendas){
        this.vendas = vendas;
    }

    public double getVendas(){
        return vendas;
    }

}
class Horista extends Funcionario{
    private double valorH;
    private double horasT;

    public Horista(String nome, String dataNasc, double valorH, double horasT){
        super(nome, dataNasc, 0);
        this.valorH = valorH;
        this.horasT = horasT;
    }

    @Override
    public double getSalario(){
        return valorH * horasT;
    }

    public void setValorH(double valorH){
        this.valorH = valorH;
    }

    public double getValorH(){
        return valorH;
    }

    public void setHorasT(double horasT){
        this.horasT = horasT;
    }

    public double getHorasT(){
        return horasT;
    }
}
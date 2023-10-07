class Operario extends Funcionario{
    private double valorP;
    private double quantP;

    public Operario(String nome, String dataNasc, double valorP, double quantP){
        super(nome, dataNasc, 0);
        this.valorP = valorP;
        this.quantP = quantP;
    }

    @Override
    public double getSalario(){
        return valorP * quantP;
    }

    public void setValorP(double valorP){
        this.valorP = valorP;
    }

    public double getValorP(){
        return valorP;
    }

    public void setQuantP(double quantP){
        this.quantP = quantP;
    }

    public double getQuantP(){
        return quantP;
    }
}
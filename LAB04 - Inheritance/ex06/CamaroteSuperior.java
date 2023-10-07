public class CamaroteSuperior extends Vip{

    private String localizacao;
    private double valorAdd

    public CamaroteSuperior(double valor, double valorAdiconal, String localizacao, double valorAdd){
        super(valor,valorAdiconal);
        this.localizacao = localizacao;
        this.valorAdd = valorAdd;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public void setValorAdd(double valorAdd){
        this.valorAdd = valorAdd;
    }

    public double getValorAdd(){
        return valorAdd;
    }

    public void escreveLocalizacaoEValor(){
        System.out.println("Localizacao do camarote superior: " + localizacao);
        System.out.println("Valor Adiconal do camarote superior: " + valorAdd);
    }

}

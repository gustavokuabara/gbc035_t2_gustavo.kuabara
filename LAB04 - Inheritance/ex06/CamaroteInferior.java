public class CamaroteInferior extends Vip{

    private String localizacao;

    public CamaroteInferior(double valor, double valorAdiconal, String localizacao){
        super(valor,valorAdiconal);
        this.localizacao = localizacao;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public void escreveLocalizacao(){
        System.out.println("Localizacao do camarote inferior: " + localizacao);
    }

}

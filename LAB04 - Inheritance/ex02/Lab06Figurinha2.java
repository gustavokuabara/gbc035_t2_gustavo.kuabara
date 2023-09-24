public class Lab06Figurinha2{
   protected String nomeJogador;
   protected String dataNasc;
   protected Double altura;
   protected Double peso;
   protected String posicao;
   protected String pais;

    public Lab06Figurinha2(String nomeJogador, String dataNasc, Double altura, Double peso, String posicao, String pais){
        this.nomeJogador = nomeJogador;
        this.dataNasc = dataNasc;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void MostrarFigurinha() {
        System.out.println("\n--Nome do Jogador: " + this.nomeJogador);
        System.out.println("\n--Data de Nascimento: " + this.dataNasc);
        System.out.println("\n--Altura: " + this.altura);
        System.out.println("\n--Peso: " + this.peso);
        System.out.println("\n--Posicao: " + this.posicao);
        System.out.println("\n--Pais: " + this.pais);
    }

    public void setNomeJogador(String nomeJogador){
        this.nomeJogador = nomeJogador;
    }

    public void setdataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getNomeJogador(String nomeJogador){
        return this.nomeJogador;
    }

    public String getdataNasc(String dataNasc){
        return this.dataNasc;
    }

    public Double getAltura(Double altura){
        return this.altura;
    }

    public Double getPeso(Double peso){
        return this.peso;
    }

    public String getPosicao(String posicao){
        return this.posicao;
    }

    public String getPais(String pais){
        return this.pais;
    }
}

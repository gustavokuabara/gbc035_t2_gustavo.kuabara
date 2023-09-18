public class Figurinha3{
    private String nomeJogador;
    private String dataNasc;
    private Double altura;
    private Double peso;
    private String posicao;
    private String pais;

    public Figurinha3(String nomeJogador, String dataNasc, Double altura, Double peso, String posicao, String pais){
        this.nomeJogador = nomeJogador;
        this.dataNasc = dataNasc;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
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

    public void Info() {
        System.out.println("Nome do Jogador: " + nomeJogador);
        System.out.println("Data de Nascimento: " + dataNasc);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posicao: " + posicao);
        System.out.println("Pais: " + pais);
    }
}
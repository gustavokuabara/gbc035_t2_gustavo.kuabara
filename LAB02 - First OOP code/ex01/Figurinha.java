public class Figurinha{
    private String nomeJogador;
    private String dataNasc;
    private Double altura;
    private Double peso;
    private String posicao;
    private String pais;

    public Figurinha(String nomeJogador, String dataNasc, Double altura, Double peso, String posicao, String pais){
        this.nomeJogador = nomeJogador;
        this.dataNasc = dataNasc;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void Info(){
        System.out.println("--Nome do Jogador: " + nomeJogador);
        System.out.println("--Data de Nascimento: " + dataNasc);
        System.out.println("--Altura: " + altura);
        System.out.println("--Peso: " + peso);
        System.out.println("--Posicao: " + posicao);
        System.out.println("--Pais: " + pais);
    }
}
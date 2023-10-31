public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public boolean eMenorQue(Classificavel a){
        Cliente compara = (Cliente) a;
        return this.nome.compareTo(compara.nome) < 0; //função semelhante a strcmp em c
    }

    public String getNome(){
        return nome;
    }
}
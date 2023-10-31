public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public int compare(Classificavel a) {
        Cliente compara = (Cliente) a;
        return this.nome.compareTo(compara.nome);
    }

    public String getNome() {
        return nome;
    }
}
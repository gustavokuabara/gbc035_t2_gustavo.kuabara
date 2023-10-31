public class Produto implements Classificavel{
    private int code;

    public Produto(int code) {
        this.code = code;
    }

    public int compare(Classificavel a) {
        Produto compara = (Produto) a;
        return this.code - compara.code;
    }

    public int getCode() {
        return code;
    }
}
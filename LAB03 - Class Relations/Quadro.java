public class Quadro{

    private String tipo;
    private Integer serie;

    public Quadro(String tipo, Integer serie){
        this.tipo = tipo;
        this.serie = serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }
}

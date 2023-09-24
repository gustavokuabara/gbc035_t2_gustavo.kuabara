public class C1{

    public int a1;
    protected int b1;
    private int c1;

    public C1(){
        System.out.println("Chamada do construtor de C1 sem parametros.\n");
    }

    //aqui não se usa super, porem o mostrardados desse contrutor tem o nome de MostrarDadosSuper
    public C1(int a1, int b1, int c1){
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        System.out.println("Chamada do construtor de C1 com parametros.\n");
    }

    public void mostrarDados(){
        System.out.println("a1: " + a1);
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);
    }

    public void mostrarDadosSuper(){
        System.out.println("a1: " + a1);
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);
    }
}
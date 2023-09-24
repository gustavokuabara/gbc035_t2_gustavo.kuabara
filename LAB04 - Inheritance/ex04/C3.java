public class C3 extends C2{
    public int a3;
    protected int b3;
    private int c3;

    public C3(){
        System.out.println("Chamada do construtor de C3 sem parametros.\n");
    }

    public C3(int a1, int b1, int c1, int a2, int b2, int c2, int a3, int b3, int c3){
        super(a1, b1, c1, a2, b2, c2);
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        System.out.println("Chamada do construtor de C3 com parametros.\n");
    }

    public void mostrarDados() {
        System.out.println("a3: " + a3);
        System.out.println("b3: " + b3);
        System.out.println("c3: " + c3);
        super.mostrarDados();
    }

    public void mostrarDadosSuper() {
        System.out.println("a3: " + a3);
        System.out.println("b3: " + b3);
        System.out.println("c3: " + c3);
        super.mostrarDadosSuper();
    }
}
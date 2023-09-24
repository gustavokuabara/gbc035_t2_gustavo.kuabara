public class C2 extends C1{
    public int a2;
    protected int b2;
    private int c2;

    public C2(){
        System.out.println("Chamada do construtor de C2 sem parametros.\n");
    }

    public C2(int a1, int b1, int c1, int a2, int b2, int c2){
        super(a1, b1, c1);
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
        System.out.println("Chamada do construtor de C2 com parametros.\n");
    }

    public void mostrarDados() {
        System.out.println("a2: " + a2);
        System.out.println("b2: " + b2);
        System.out.println("c2: " + c2);
        super.mostrarDados();
    }

    public void mostrarDadosSuper() {
        System.out.println("a2: " + a2);
        System.out.println("b2: " + b2);
        System.out.println("c2: " + c2);
        super.mostrarDadosSuper();
    }
}
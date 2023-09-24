public class Lab06_Ex04{
    
    public static void main(String[] args){
        System.out.println("\n\n--Chamadas sem parametro:");
        C1 class1 = new C1();
        C2 class2 = new C2();
        C3 class3 = new C3();

        System.out.println("\n\n--Chamadas com parametro:");
        C1 classe1 = new C1(1, 2, 3);
        C2 classe2 = new C2(11, 12, 13, 14, 15, 16);
        C3 classe3 = new C3(21, 22, 23, 24, 25, 26, 27, 28, 29);

        System.out.println("--C1");
        class1.mostrarDados();
        System.out.println("\n--------------\n");
        classe1.mostrarDadosSuper();

        System.out.println("\n--C2:");
        class2.mostrarDados();
        System.out.println("\n--------------\n");
        classe2.mostrarDadosSuper();

        System.out.println("\n--C3:");
        class3.mostrarDados();
        System.out.println("\n--------------\n");
        classe3.mostrarDadosSuper();
    }
}
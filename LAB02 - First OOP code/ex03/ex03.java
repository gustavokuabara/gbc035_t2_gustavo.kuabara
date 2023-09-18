public class ex03{
    public static void main(String[] args) {
        Figurinha3[] figurinhas = new Figurinha3[3];

        figurinhas[0] = new Figurinha3("Neymar Jr.", "10/01/1943", 1.75, 75.0, "Atacante", "Brasil");
        figurinhas[1] = new Figurinha3("Mbappe", "23/06/1989", 1.72, 76.0, "Atacante", "Franca");
        figurinhas[2] = new Figurinha3("Cristiano Ronaldo", "02/02/1942", 1.90, 84.0, "Atacante", "Portugal");

        for (int i = 0; i < 3; i++) {
            figurinhas[i].Info();
            System.out.println();
        }
    }
}
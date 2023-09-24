public class Lab06_Ex01{
    public static void main(String[] args) {
        Lab06Figurinha jogador1 = new Lab06Figurinha("Neymar Jr", "10/01/1943", 1.75, 75.0, "Atacante", "Brasil");
        Lab06Figurinha jogador2 = new Lab06Figurinha("Mbappe", "23/06/1989", 1.72, 76.0, "Atacante", "Franca");
        FigurinhaExtra jogadorExtra1 = new FigurinhaExtra("Legends", "prata", jogador2);

        System.out.println("Informacoes do Jogador 1:");
        jogador1.MostrarFigurinha();
        System.out.println("\nInformacoes do Jogador 2:");
        jogadorExtra1.MostrarFigurinhaExtra();
    }
}

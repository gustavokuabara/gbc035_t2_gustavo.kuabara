public class ex01{
    public static void main(String[] args) {
        // Crie três instâncias da classe Figurinha com informações de jogadores de sua preferência
        Figurinha2 jogador1 = new Figurinha2("Neymar Jr", "10/01/1943", 1.75, 75.0, "Atacante", "Brasil");
        Figurinha2 jogador2 = new Figurinha2("Mbappe", "23/06/1989", 1.72, 76.0, "Atacante", "Franca");
        Figurinha2 jogador3 = new Figurinha2("Cristiano Ronaldo", "02/02/1942", 1.90, 84.0, "Atacante", "Portugal");

        System.out.println("Informacoes do Jogador 1:");
        jogador1.Info();
        
        System.out.println("\nInformacoes do Jogador 2:");
        jogador2.Info();
        
        System.out.println("\nInformacoes do Jogador 3:");
        jogador3.Info();
    }
}

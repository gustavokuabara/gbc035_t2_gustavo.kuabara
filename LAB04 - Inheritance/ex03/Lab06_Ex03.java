public class Lab06_Ex03{
    public static void main(String[] args) {
        Lab06Figurinha3 jogador1 = new Lab06Figurinha3("Neymar Jr", "10/01/1943", 1.75, 75.0, "Atacante", "Brasil");
        Lab06Figurinha3 jogador2 = new Lab06Figurinha3("Mbappe", "04/11/1957", 1.79, 82.3, "Atacante", "Franca");
        FigurinhaExtra3 jogadorExtra1 = new FigurinhaExtra3(jogador2,"Legends", "Ouro");

        System.out.println("Informacoes do Jogador 1:");
        jogador1.MostrarFigurinha();
        System.out.println("\nInformacoes do Jogador 2:");
        jogadorExtra1.MostrarFigurinhaExtra();
    }
}

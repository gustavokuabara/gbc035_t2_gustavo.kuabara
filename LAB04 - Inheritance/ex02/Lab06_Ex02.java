public class Lab06_Ex02{
    public static void main(String[] args) {
        Lab06Figurinha2 jogador1 = new Lab06Figurinha2("Neymar Jr", "10/01/1943", 1.75, 75.0, "Atacante", "Brasil");
        FigurinhaExtra2 jogadorExtra1 = new FigurinhaExtra2("Mbappe", "23/06/1989", 1.72, 76.0, "Atacante", "Franca","Legends", "prata");

        System.out.println("Informacoes do Jogador 1:");
        jogador1.MostrarFigurinha();
        System.out.println("\nInformacoes do Jogador 2:");
        jogadorExtra1.MostrarFigurinhaExtra();
    }
}

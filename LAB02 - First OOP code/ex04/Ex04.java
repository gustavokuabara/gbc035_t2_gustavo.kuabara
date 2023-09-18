public class Ex04{
    public static void main(String[] args) {
        Figurinha4 jogador1 = new Figurinha4("Neymar Jr", "10/01/1943", 1.75, 75.0, "Atacante", "Brasil");
        Figurinha4 jogador2 = new Figurinha4("Mbappe", "23/06/1989", 1.72, 76.0, "Atacante", "Franca");
        Figurinha4 jogador3 = new Figurinha4("Cristiano Ronaldo", "02/02/1942", 1.90, 84.0, "Atacante", "Portugal");
        Figurinha4 jogador4 = new Figurinha4("Neymar Jr1", "10/01/1943", 1.75, 75.0, "Atacante", "Brasil");
        Figurinha4 jogador5 = new Figurinha4("Mbappe1", "23/06/1989", 1.72, 76.0, "Atacante", "Franca");
        Figurinha4 jogador6 = new Figurinha4("Cristiano Ronaldo1", "02/02/1942", 1.90, 84.0, "Atacante", "Portugal");
        Figurinha4 jogador7 = new Figurinha4("Neymar Jr2", "10/01/1943", 1.75, 75.0, "Atacante", "Brasil");
        Figurinha4 jogador8 = new Figurinha4("Mbappe2", "23/06/1989", 1.72, 76.0, "Atacante", "Franca");
        Figurinha4 jogador9 = new Figurinha4("Cristiano Ronaldo2", "02/02/1942", 1.90, 84.0, "Atacante", "Portugal");
        Figurinha4 jogador10 = new Figurinha4("Neymar Jr3", "10/01/1943", 1.75, 75.0, "Atacante", "Brasil");
        Figurinha4 jogador11 = new Figurinha4("Mbappe3", "23/06/1989", 1.72, 76.0, "Atacante", "Franca");
       
        Selecao sele1 = new Selecao("Vasco","Ribamar");
        Selecao sele2 = new Selecao("Flamengo","Luva");

        sele1.adicionarJogador(jogador1);
        sele1.adicionarJogador(jogador2);
        sele1.adicionarJogador(jogador3);
        sele1.adicionarJogador(jogador4);
        sele1.adicionarJogador(jogador5);
        sele1.adicionarJogador(jogador6);
        sele1.adicionarJogador(jogador7);
        sele1.adicionarJogador(jogador8);
        sele1.adicionarJogador(jogador9);
        sele1.adicionarJogador(jogador10);
        sele1.adicionarJogador(jogador11);
        
        sele2.adicionarJogador(jogador1);
        sele2.adicionarJogador(jogador2);
        sele2.adicionarJogador(jogador3);
        sele2.adicionarJogador(jogador4);
        sele2.adicionarJogador(jogador5);
        sele2.adicionarJogador(jogador6);
        sele2.adicionarJogador(jogador7);
        sele2.adicionarJogador(jogador8);
        sele2.adicionarJogador(jogador9);
        sele2.adicionarJogador(jogador10);
        sele2.adicionarJogador(jogador11);

        System.out.println("\n--Selecao 1: ");
        sele1.mostrarSelecao();
        System.out.println("\n\n--Selecao 2: ");
        sele2.mostrarSelecao();
    }
}

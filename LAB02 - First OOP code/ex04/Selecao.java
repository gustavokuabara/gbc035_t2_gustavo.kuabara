public class Selecao {
    private String nomeS;
    private Figurinha4[] jogadores;
    private String Tecnico;


    public Selecao(String nomeS, String Tecnico){
        this.nomeS = nomeS;
        this.Tecnico = Tecnico;
        this.jogadores = new Figurinha4[11];
    }

    public void adicionarJogador(Figurinha4 jogador){
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] == null) {
                jogadores[i] = jogador;
                System.out.println(jogador.getNomeJogador(nomeS) + " Adicionado a selecao.");
                return;
            }
        }
    }

    public void mostrarSelecao(){
        System.out.println("Selecao : " + nomeS);
        System.out.println("Tecnico : " + Tecnico);
        for(Figurinha4 jogadores : jogadores){
        System.out.println();
        jogadores.Info();
        }
    }
}
public class lab03{
    public static void main(String[] args) {
        Barco embarcacao = new Barco("Titanic");
        Porto Porto1 = new Porto("Rio de Janeiro");
        Quadro quadro1 = new Quadro("tipo_1", 3223);
        Quadro quadro2 = new Quadro("tipo_2", 4223);
        Bicicleta bike = new Bicicleta("BMX", quadro2);
        Cerebro cerebro1 = new Cerebro("Normal");
        Cabeca humana = new Cabeca(cerebro1);

        System.out.println("--Ex 01: ");
        System.out.println(embarcacao.getNome() + " esta no porto: " + Porto1.getNome() + ".");
        System.out.println("Nao ha relacao de dependencia entre as classes, logo sao independentes.");

        System.out.println("--Ex 02: ");
        bike.setQuadro(quadro1);
        System.out.println("Bicicleta: " + bike.getNome() + " ,Quadro: " + bike.getQuadro().getTipo() + " ,Serie: " + bike.getQuadro().getSerie());
        System.out.println("Objetos podem existir sem o outro, sendo independentes entre si.");

        System.out.println("--Ex 02: ");
        System.out.println("O cerebro da humana esta " + humana.getCerebro().getEstado());
        System.out.println("Objetos nao podem existir sem o outro, sendo dependentes entre si.");
    }
}

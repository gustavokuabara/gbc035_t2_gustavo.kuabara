class Empresa{
    public static void main(String[] args){
        Funcionario[] funcionarios = new Funcionario[8];

        funcionarios[0] = new Chefe("Malenia", "10/08/1934", 20000.0);
        funcionarios[1] = new Chefe("Galinha", "04/06/1974", 20000.0);
        funcionarios[2] = new Vendedor("Bot", "07/06/2003", 1200.0, 0.2, 20000.0);
        funcionarios[3] = new Vendedor("Daniel", "18/07/2005", 1000.0, 0.1, 20000.0);
        funcionarios[4] = new Operario("Pedro", "06/10/2004", 2.3, 1400.0);
        funcionarios[5] = new Operario("Thiago", "07/02/2004", 2.3, 1400.0);
        funcionarios[6] = new Horista("Diogo", "12/11/2008", 11.0, 200.0);
        funcionarios[7] = new Horista("Big", "21/04/2007", 8.0, 140.0);

        FolhaDePagamento.printar(funcionarios);
    }
}
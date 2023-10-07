class FolhaDePagamento {
    public static void printar(Funcionario[] funcionarios) {
        if(funcionarios != null){
                for (Funcionario funcionario : funcionarios) {
                        System.out.println("Nome: " + funcionario.getNome());
                        System.out.println("Data de Nascimento: " + funcionario.getDataNasc());
                        System.out.println("Salario: " + funcionario.getSalario());
                        System.out.println("\n");
                }
        }
    }
}
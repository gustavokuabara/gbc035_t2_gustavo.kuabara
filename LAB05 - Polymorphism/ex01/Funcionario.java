class Funcionario{
    private String nome;
    private String dataNasc;
    private double salario;

    public Funcionario(String nome, String dataNasc, double salario) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.salario = salario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }

    public String getDataNasc(){
        return dataNasc;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void mostrarFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNasc);
        System.out.println("Salario: " + salario);
    }
}
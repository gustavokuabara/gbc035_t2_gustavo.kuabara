public class Funcionario {
    private String CPF;
    private String nome;
    private double salario;
    private double tetosalario = 40000;

    public Funcionario(String CPF, String nome, double salario) {
        this.CPF = CPF;
        this.nome = nome;
        this.salario = salario;
    }

    public double gettetoSalario() {
        return tetosalario;
    }

    public void settetoSalario(double tetosalario) {
        this.tetosalario = tetosalario;
    }

    public void aumentarSalario(double percentual) throws SalarioInvalidoException {
        if (percentual < 0) {
            throw new SalarioInvalidoException("Erro: Valor deve ser maior que 0%\n");
        }

        double novosalario = salario * (1 + percentual / 100);
        if (novosalario > tetosalario) {
            throw new SalarioInvalidoException("Erro: Valor ultrapassa o teto\n");
        }

        salario = novosalario;
    }

    public double getSalario() {
        return salario;
    }

}

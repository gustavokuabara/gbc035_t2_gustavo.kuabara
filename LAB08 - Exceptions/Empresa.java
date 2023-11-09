public class Empresa{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("54434124321", "Linguinni", 1000);
        try {
            funcionario.aumentarSalario(10); // Aumentando o salário em 10%
        } catch (SalarioInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salario atual: R$" + funcionario.getSalario());
        }
    }
}

/*throw e throws:

throw: Usada para lançar uma exceção  em um método ou bloco de código.
throws: Usada na assinatura de um método indicando que o método pode lançar exceções.

Checked vs. Unchecked Exceptions:

Checked Exceptions: São exceções que somos obrigados a lidar com, através de try-catch ou throws na assinatura do método. 
Unchecked Exceptions: São exceções que não somos obrigados a lidar com elas.
 */
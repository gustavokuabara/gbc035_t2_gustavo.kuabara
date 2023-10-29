public class UsaBanco {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial(2000, 1000, 1234, 500);
        ContaEspecial conta2 = new ContaEspecial(3000, 1001, 5678, 1000);

        System.out.println("Saldo da Conta 1: " + conta1.getSaldo(1234));
        System.out.println("Saldo da Conta 2: " + conta2.getSaldo(5678));

        conta1.debitarValor(200, 1234);
        conta2.debitarValor(100, 5678);

        System.out.println("Novo saldo da Conta 1: " + conta1.getSaldo(1234));
        System.out.println("Novo saldo da Conta 2: " + conta2.getSaldo(5678));
        System.out.println("Limite da Conta 1: " + conta1.getLimite());

        conta1.setLimite(200);
        System.out.println("Novo limite da Conta 1: " + conta1.getLimite());

        conta2.debitarValor(5000, 5678);
        System.out.println("Saldo da Conta 2 depois de tentativa de debito falha: " + conta2.getSaldo(5678));
    }
}
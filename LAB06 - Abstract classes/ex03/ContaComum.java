public class ContaComum extends ContaCorrente {
    public ContaComum(double saldoInicial, int num, int senha) {
        super(saldoInicial, num, senha);
    }

    @Override
    public void debitarValor(double valor, int senha) {
        if (this.senha != senha) return;
        if (estado != 1) return;
        if (valor < 0 || valor > saldo)
            return;
        saldo -= valor;
        if (saldo == 0)
            estado = 2;
    }
}

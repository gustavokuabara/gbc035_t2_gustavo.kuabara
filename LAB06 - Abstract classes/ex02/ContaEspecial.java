public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(double saldoInicial, int num, int senha, float limite) {
        super(saldoInicial, num, senha);
        this.limite = limite;
    }

    @Override
    public void debitarValor(double valor, int senha) {
        if (this.senha != senha) return;
        if (estado != 1)return;
        if (valor < 0 || (saldo + limite < valor && limite > 0))
            return;
        saldo -= valor;
        if (saldo == 0) estado = 2;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float novoLimite) {
        limite = novoLimite;
    }
}
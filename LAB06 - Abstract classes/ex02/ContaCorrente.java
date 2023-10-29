abstract class ContaCorrente {
    protected double saldo;
    protected int estado;
    protected int numConta;
    protected int senha;

    //conta ativa , estado = 1
    //conta zerada, estado = 2
    public ContaCorrente(double saldo, int numConta, int senha) {
        this.numConta = numConta;
        this.senha = senha;
        this.saldo = saldo;
        this.estado = 1;
    }

    public abstract void debitarValor(double valor, int senha);

    public double getSaldo(int senha) {
        if(this.senha == senha)
            return saldo;
        else
            return -1;
    }

    public void creditarValor(int senha, double valor) {
        if(this.senha == senha)
            saldo += valor;
    }

    protected int getEstado(int senha) {
        if(this.senha == senha)
            return estado;
        else
            return -1;
    }

    protected void setEstado(int senha, int novoEstado) {
        if(this.senha == senha)
            estado = novoEstado;
    }

    protected boolean verificarSenha(int senha) {
        return this.senha == senha;
    }
}
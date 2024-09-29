public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        
    }
}

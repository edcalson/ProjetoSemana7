import java.io.Serializable;

public class ContaCorrente implements Serializable {
    private double saldo;

    public double getSaldo(){
        return this.saldo;
    }

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.saldo - valor < 0){
            throw new SaldoInsuficienteException(String.format(
                    "Você está tentando sacar R$ %.2f, mas você tem R$ %.2f na conta",
                    valor, this.saldo));
        }

        this.saldo -= valor;
    }
}

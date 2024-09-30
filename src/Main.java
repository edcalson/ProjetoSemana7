public class Main {
    public static void main(String[] args) {

        ContaCorrente contaExemplo = new ContaCorrente(1000);
        System.out.println("O saldo atual é de R$" + contaExemplo.getSaldo());

           // vamos sacar R$ 800
        try {
            contaExemplo.sacar(80000);
            System.out.println("O saldo atual é de R$" + contaExemplo.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

            // vamos sacar R$ 200
        try {
            contaExemplo.sacar(200);
            System.out.println("O saldo atual é de R$" + contaExemplo.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

            // vamos sacar R$ 1000000
        try {
            contaExemplo.sacar(1000000);
            System.out.println("O saldo atual é de R$" + contaExemplo.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

}
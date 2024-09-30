import java.util.concurrent.ExecutionException;

public class SaldoInsuficienteException extends ExecutionException {
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}

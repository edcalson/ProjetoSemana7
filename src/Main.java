import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Leitura
        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream(new FileInputStream("contaExemplo.test"));

            Object objeto = null;
            while ((objeto = inputStream.readObject()) != null) {
                if (objeto instanceof ContaCorrente) {
                    ContaCorrente conta = (ContaCorrente) objeto;
                    System.out.println(conta.getSaldo());
                }
            }
            inputStream.close();
        } catch (EOFException e ) {
            System.out.println("Fim do arquivo alcançado!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
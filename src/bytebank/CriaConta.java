package bytebank;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.setSaldo(200);
        System.out.println(primeiraConta.getSaldo());
    }
}

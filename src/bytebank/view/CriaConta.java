package bytebank.view;

import bytebank.model.entity.Conta;
import bytebank.model.entity.ContaCorrente;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new ContaCorrente(890, 123);
        primeiraConta.setSaldo(200);
        System.out.println(primeiraConta.getSaldo());
    }
}

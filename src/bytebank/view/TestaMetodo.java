package bytebank.view;

import bytebank.model.entity.Cliente;
import bytebank.model.entity.Conta;
import bytebank.model.entity.ContaCorrente;
import bytebank.model.entity.ContaPoupanca;

public class TestaMetodo {
    public static void main(String[] args) {
        Cliente natasha = new Cliente();
        natasha.setNome("Natasha Busnardo");
        natasha.setCpf("222.222.222-22");
        natasha.setProfissao("programadora");

        Conta contaDaNatasha = new ContaCorrente(123, 456);
        contaDaNatasha.deposita(100);

        contaDaNatasha.setTitular(natasha);
        System.out.println(contaDaNatasha.getTitular().getNome());
        System.out.println(contaDaNatasha.getTitular());
        System.out.println(contaDaNatasha.getSaldo());

        Conta conta2 = new ContaPoupanca(1337, 16549);
        Conta conta3 = new ContaCorrente(2112, 14660);

        System.out.println(Conta.getTotal());
    }
}
package bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Cliente natasha = new Cliente();
        natasha.nome = "Natasha Busnardo";
        natasha.cpf = "222.222.222-22";
        natasha.profissao = "programadoraa";

        Conta contaDaNatasha = new Conta();
        contaDaNatasha.deposita(100);

        contaDaNatasha.titular = natasha;
        System.out.println(contaDaNatasha.titular.nome);
        System.out.println(contaDaNatasha.titular);
        System.out.println(contaDaNatasha.saldo);
    }
}
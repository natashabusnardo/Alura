package bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Cliente natasha = new Cliente();
        natasha.setNome("Natasha Busnardo");
        natasha.setCpf("222.222.222-22");
        natasha.setProfissao("programadora");

        Conta contaDaNatasha = new Conta();
        contaDaNatasha.deposita(100);

        contaDaNatasha.setTitular(natasha);
        System.out.println(contaDaNatasha.getTitular().getNome());
        System.out.println(contaDaNatasha.getTitular());
        System.out.println(contaDaNatasha.getSaldo());
    }
}
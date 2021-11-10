package bytebank;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("natasha");
        gerente.setSalario(5000);

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2500);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(gerente);
        controleBonificacao.registra(funcionario);

        System.out.println(controleBonificacao.getSoma());
    }
}

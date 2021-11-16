package bytebank.view;

import bytebank.controller.ControleBonificacao;
import bytebank.model.entity.Gerente;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("natasha");
        gerente.setSalario(5000);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(gerente);

        System.out.println(controleBonificacao.getSoma());
    }
}

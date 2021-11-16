package bytebank.view;

import bytebank.controller.SistemaInterno;
import bytebank.model.entity.Administrador;
import bytebank.model.entity.Cliente;
import bytebank.model.entity.Gerente;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador administrador = new Administrador();
        administrador.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(4444);

        SistemaInterno sistemaInterno = new SistemaInterno();
        System.out.println(sistemaInterno.autentica(gerente));
        System.out.println(sistemaInterno.autentica(administrador));
        System.out.println(sistemaInterno.autentica(cliente));

    }
}

package bytebank.view;

import bytebank.controller.CalculadorDeImposto;
import bytebank.model.entity.ContaCorrente;
import bytebank.model.entity.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(111, 222);
        contaCorrente.deposita(100);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(contaCorrente);
        calculadorDeImposto.registra(seguroDeVida);

        System.out.println(calculadorDeImposto.getTotalImposto());
    }
}

package bytebank.model.entity;

public class SeguroDeVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 42;
    }
}

package bytebank.model.entity;

import bytebank.controller.AutenticacaoUtil;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    private AutenticacaoUtil autenticacaoUtil;

    public double getBonificacao() {
        return getBonificacao() + super.getSalario();
    }

    public Gerente() {
        this.autenticacaoUtil = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticacaoUtil.autentica(senha);
    }
}

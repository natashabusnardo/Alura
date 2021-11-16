package bytebank.model.entity;

import bytebank.controller.AutenticacaoUtil;

public class Administrador extends Funcionario implements Autenticavel {
    private int senha;
    private AutenticacaoUtil autenticacaoUtil;

    @Override
    public double getBonificacao() {
        return 50;
    }

    public Administrador(){
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

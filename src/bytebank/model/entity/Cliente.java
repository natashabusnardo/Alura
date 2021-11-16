package bytebank.model.entity;

import bytebank.controller.AutenticacaoUtil;

/**
 * Classe que representa o cliente.
 *
 * @author Natasha Busnardo
 */
public class Cliente implements Autenticavel {
    private String nome;
    private String cpf;
    private String profissao;
    private int senha;
    private AutenticacaoUtil autenticacaoUtil;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Cliente() {
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

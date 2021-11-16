package bytebank.controller;

import bytebank.model.entity.Autenticavel;

public class SistemaInterno {
    private int senha = 2222;

    public String autentica(Autenticavel autenticavel){
        boolean autenticou = autenticavel.autentica(this.senha);
        if(autenticou)
            return ("Você entrou");
        else
            return ("Você não entrou");
    }
}

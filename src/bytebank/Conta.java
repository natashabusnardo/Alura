package bytebank;

/**
 * Classe que representa a conta bancária.
 *
 * @author Natasha Busnardo
 */
public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    /** Método que realiza o depósito em uma conta bancária.
     * @param valor valor a ser depositado.
     *
     */
    public void deposita(double valor){
        this.saldo += valor;
    }

    /** Método que realiza o saque bancário verificando se há saldo disponível.
     * @param valor valor a ser sacado
     * @return Retorna um valor booleano que é verdadeiro caso for possível realizar o saque.
     *
     */
    public boolean saca(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    /** Método que realiza a transferência bancária verificando se há saldo disponível.
     * @param valor valor a ser transferido
     * @param destino endereco da memoria correspondente a conta que receberá a transferência.
     * @return Retorna um valor booleano que é verdadeiro caso for possível realizar a transferência.
     *
     */
    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}

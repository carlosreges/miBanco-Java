package mibanco;

public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();

    //No retorna valor
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    //Retorna valor
    public boolean retirar(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    //Retorna valor y transfiere cantidad a cuenta
    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor ){
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}

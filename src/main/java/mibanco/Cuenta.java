package mibanco;

public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    
    public static int total = 0;
    
    public Cuenta(int agencia){
        if (agencia <= 0) {
            System.out.println("No se permiten valores menores o iguales a 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total++;
        
        System.out.println("Se ha creado "+total+" cuenta");
    }

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
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getAgencia(){
        return this.agencia;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return this.numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public static int getTotal(){
        return Cuenta.total;
    }
}

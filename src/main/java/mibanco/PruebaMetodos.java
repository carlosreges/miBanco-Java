package mibanco;

public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 300;
        
        miCuenta.depositar(200);
        
        System.out.println(miCuenta.saldo);
        
        miCuenta.retirar(100);
        
        System.out.println(miCuenta.saldo);
        
        Cuenta cuentaJimena = new Cuenta();
        cuentaJimena.depositar(1000);
        
        boolean puedeTransferir = cuentaJimena.transferir(400, miCuenta);
        
        if (puedeTransferir) {
            System.out.println("Puede Transferir");
        } else {
            System.out.println("No se pudo realizar la transferencia");
        }
        System.out.println(cuentaJimena.saldo);
        System.out.println(miCuenta.saldo);
    }
}

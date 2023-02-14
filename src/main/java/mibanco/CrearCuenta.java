
package mibanco;


public class CrearCuenta {
    
    public static void main(String[] args) {
        
        //Variable          = Valor
        Cuenta primeraCuenta = new Cuenta();
        
        primeraCuenta.saldo = 200;
        
        System.out.println(primeraCuenta.saldo);
        
        primeraCuenta.saldo += 100;
        
        System.out.println(primeraCuenta.saldo);
        
    }
}

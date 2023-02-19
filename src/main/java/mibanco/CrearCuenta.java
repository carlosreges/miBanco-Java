
package mibanco;


public class CrearCuenta {
    
    public static void main(String[] args) {
        
        //Variable          = Valor
        Cuenta primeraCuenta = new Cuenta();
        
        primeraCuenta.depositar(200);
        
        System.out.println(primeraCuenta.getSaldo());
        
        primeraCuenta.depositar(100);
        
        System.out.println(primeraCuenta.getSaldo());
        
    }
}

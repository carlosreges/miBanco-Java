package mibanco;

public class TestReferencia {
    
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        
        primeraCuenta.depositar(200);
        
        Cuenta segundaCuenta = primeraCuenta;
        
        segundaCuenta.depositar(100);
        
        System.out.println("Saldo Primera cuenta: " + primeraCuenta.getSaldo());
        
        System.out.println("Saldo Segunda cuenta: " + segundaCuenta.getSaldo());
        
        segundaCuenta.depositar(400);
        
        System.out.println("Saldo Primera cuenta: " + primeraCuenta.getSaldo());
        
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }
}

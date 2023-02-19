
package mibanco;

public class PruebaConstructor {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(33);
        Cuenta cuenta2 = new Cuenta(555);
        Cuenta cuenta3 = new Cuenta(45);
        
        System.out.println(Cuenta.getTotal());
        
    }
}

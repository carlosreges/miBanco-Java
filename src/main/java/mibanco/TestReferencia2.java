package mibanco;

public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente carlos = new Cliente();
        
        carlos.nombre = "Carlos";
        carlos.documento = "95961676";
        carlos.telefono = "3513400891";
        
        Cuenta cuentaCarlos = new Cuenta();
        cuentaCarlos.agencia = 1;
        cuentaCarlos.titular = carlos;
        
        System.out.println(carlos);
    }
}

package mibanco;

public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente carlos = new Cliente();
        
        carlos.setNombre("Carlos");
        carlos.setDocumento("95961676");
        carlos.setTelefono("3513400891");
        
        Cuenta cuentaCarlos = new Cuenta();
        cuentaCarlos.setAgencia(1);
        cuentaCarlos.setTitular(carlos);
        
        System.out.println(carlos);
    }
}

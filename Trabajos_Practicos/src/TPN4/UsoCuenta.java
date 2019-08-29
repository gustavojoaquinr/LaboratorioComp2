package TPN4;

public class UsoCuenta {
    public static void main(String[] args) {
        CuentaCorriente Cuenta1 = new CuentaCorriente(500, "Juan");
        CuentaCorriente Cuenta2 = new CuentaCorriente(600, "Carlos");
        System.out.println("Cuentas:\n");
        //Imprimir datos originales
        Cuenta1.mostrarDatos();
        Cuenta2.mostrarDatos();

        System.out.println("\nTransferencia de dinero:\n");
        //Transferencia de $200
        Cuenta1.transferencia(200, Cuenta1, Cuenta2);
        //Imprimir datos modificados luego de la transferencia
        Cuenta1.mostrarDatos();
        Cuenta2.mostrarDatos();
    }
}

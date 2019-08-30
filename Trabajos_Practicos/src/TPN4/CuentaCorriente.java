package TPN4;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(double saldo, String nombreTitular) {
        this.setSaldo(saldo);
        this.setNombreTitular(nombreTitular);
        this.setNumeroCuenta((long) (Math.random() * 100 + 1));
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public void ingreso(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    public void reintegro(double cantidad) {
        this.saldo = this.saldo - cantidad;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: $" + this.getSaldo());
    }

    public void mostrarDatos() {
        System.out.println("Nombre del titular: " +getNombreTitular());
        System.out.println("Numero de cuenta: " +getNumeroCuenta());
        System.out.println("Saldo: $" +getSaldo());
        System.out.println("------------------");
    }

    public void transferencia(double cantidad, CuentaCorriente cuentaEmisor, CuentaCorriente cuentaDestino) {
        if (cuentaEmisor.getSaldo() > cantidad) {
            cuentaEmisor.setSaldo(cuentaEmisor.getSaldo() - cantidad);
            cuentaDestino.ingreso(cantidad);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }



}

package Clases.TrabajoClase5;

import java.util.Scanner;

public class CuentaCorriente {
    private String nombreTitular;
    private double saldo;
    private int nroCuenta;

    public CuentaCorriente(String nombreTitular, double saldo, int nroCuenta) {
        this.setNombreTitular(nombreTitular);
        this.setSaldo(saldo);
        this.setNroCuenta(nroCuenta);
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public static void CargarCuentas(CuentaCorriente[] cuentas) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < cuentas.length; i++) {
            System.out.print("Nombre: ");
            String nombreTitular = teclado.next();
            System.out.print("Saldo Inicial: ");
            double saldo = teclado.nextDouble();
            System.out.print("Numero de Cuenta: ");
            int nroCuenta = teclado.nextInt();
            System.out.println("------------------");
            CuentaCorriente cuenta = new CuentaCorriente(nombreTitular, saldo, nroCuenta);
            cuentas[i] = cuenta;
        }
    }

    public static void ListarCuentas(CuentaCorriente[] cuentas) {
        for (CuentaCorriente cuenta : cuentas) {
            System.out.println("Nombre: " + cuenta.nombreTitular);
            System.out.println("Saldo Inicial: " + cuenta.saldo);
            System.out.println("Numero de Cuenta: " + cuenta.nroCuenta);
            System.out.println("------------------");
        }
    }

    public void ingresarDinero(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    public void sacarDinero(double cantidad) {
        if (this.saldo > cantidad) {
            this.saldo = this.saldo - cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Tu saldo es:" + this.saldo);
    }

    public String mostrarDatos() {
        return  "\n" +
                "Nombre de cuenta: " +nombreTitular+ "\n" +
                "Saldo: " +saldo+ "\n" +
                "Numero de cuenta: " +nroCuenta;
    }

    public void transferencia(CuentaCorriente clienteDestino, double tranferir){
        this.saldo -= tranferir;
        clienteDestino.saldo += tranferir;
    }

//    public static void Transferencias(CuentaCorriente origen, CuentaCorriente destino, double cantidad) {
//        origen.sacarDinero(cantidad);
//        destino.ingresarDinero(cantidad);

}

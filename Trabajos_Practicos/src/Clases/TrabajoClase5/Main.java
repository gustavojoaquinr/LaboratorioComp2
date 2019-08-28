package Clases.TrabajoClase5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado= new Scanner (System.in);
        System.out.println("INGRESO DE CUENTAS\nCantidad de cuentas a ingresar: ");
        int cantCtas = teclado.nextInt();
        int a=0,b=0;
        int opc=0;int opc2=0;
        double monto=0;

        CuentaCorriente [] cuentas = new CuentaCorriente[cantCtas];
        CuentaCorriente.CargarCuentas(cuentas);
        CuentaCorriente.ListarCuentas(cuentas);

        do {
            System.out.println("MENU de opciones");
            System.out.println("Que operacion desea realizar?\n1- Ingresar dinero\n2- Sacar dinero\n3- Mostrar saldo de cuenta");
            System.out.println("4- Mostrar datos de cuenta\n5- Transferencia de dinero\n");
            opc = teclado.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Ingresar dinero a la cuenta:");
                    a = teclado.nextInt();
                    if (a == 1 || a == 2){
                        System.out.println("Cuanto dinero desea ingresar?");
                        monto = teclado.nextDouble();
                        cuentas[a-1].ingresarDinero (monto);
                    }else {
                        System.out.println("ERROR, Cuenta no valida");
                    }
                    break;
                case 2:
                    System.out.println("Sacar dinero de la cuenta:");
                    a = teclado.nextInt();
                    if (a == 1 || a == 2){
                        System.out.println("Cuanto dinero desea retirar?");
                        monto = teclado.nextDouble();
                        cuentas[a-1].sacarDinero(monto);
                    }else {
                        System.out.println("ERROR, Cuenta no valida");
                    }
                    break;
                case 3:
                    System.out.println("Mostrar saldo de la cuenta:");
                    a = teclado.nextInt();
                    if (a == 1 || a == 2){
                        System.out.println("Saldo cuenta" +(a)+ ":" +cuentas [a-1].getSaldo());
                    }else System.out.println("ERROR, Cuenta no valida");
                    break;
                case 4:
                    System.out.println("Mostrar datos de la cuenta:");
                    a = teclado.nextInt();
                    if (a== 1 || a== 2) {
                        System.out.println("Datos de la cuenta " +(a)+ ":" + cuentas[a-1].mostrarDatos());
                    } else System.out.println("ERROR, Cuenta no valida");
                    break;
                case 5:
                    System.out.println("Transferir dinero de la cuenta:");
                    int cuentaOrigen = teclado.nextInt();
                    System.out.println("A la cuenta:");
                    int cuentaDestino = teclado.nextInt();
                    System.out.println("Cuanto desea transferir?");
                    double transferir = teclado.nextDouble();
                    cuentas[cuentaOrigen-1].transferencia(cuentas [cuentaDestino-1],transferir);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("\nSi desea volver al MENU de opciones presione 1\nSi desea SALIR presione 2\n");
            opc2 = teclado.nextInt();
        }while (opc2 != 2);

    }
}

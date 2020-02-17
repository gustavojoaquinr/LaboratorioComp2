package Progi.Final;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ADMIN="joaquin";
        String PASS="12345";
        boolean validado=validacion(ADMIN, PASS);
        //int DIA = dia();
        //int MES = mes();
        //int ANIO = anio();
        antiguedad();
        boolean antiguo=antiguedad(18,2,2019);
        calculoSueldo();

    }


    static public boolean validacion(String ADMIN, String PASS) {
        Scanner sc= new Scanner(System.in);

        boolean retorno=false;
        for(int i=0; i<10; i++) {
            System.out.println("Ingrese su nombre de usuario: ");
            String adm=sc.next();
            System.out.println("Ingrese su contrasena: ");
            String pass=sc.next();

            if(adm.equals(ADMIN)&& pass.equals(PASS)) {
                retorno=true;
                System.out.println("Los datos son correctos");
                System.out.println(" ");
                break;
            }else {
                System.out.println("El usuario no es valido. Volver a ingresar los datos");
            }
        }
        return retorno;
    }



    static public boolean antiguedad(int dia, int mes, int anio){
        Scanner sc= new Scanner(System.in);
        int opc=0;
        String nombre;
        boolean retorno=false;
        System.out.println("Antiguedad empledado");
        do {
            System.out.println("Ingrese dia (1-30):");
            dia = sc.nextInt();
            System.out.println("Ingrese mes (1-12) :");
            mes = sc.nextInt();
            System.out.println("Ingrese anio:");
            anio = sc.nextInt();

            if ((dia >= 1) && (dia <= 30)) {
                if ((mes >= 1) && (mes <= 12)) {
                    if (anio >= 1 && anio <= 2019) {
                        if (mes < 6 && anio <= 2017) {
                            System.out.println("La antiguedad es superior a 2 años y 6 meses");
                            retorno=true;
                            break;
                        } else {
                            System.out.println("Antiguedad invalida, menor a la requerida");
                        }
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("El mes en incorrecto");
                }
            } else {
                System.out.println("El dia es incorrecto");
            }

            System.out.println("Para salir ingrese 1, Para seguir verificacando antiguedad ingrese 2");
            opc = sc.nextInt();
        }while(opc != 1);

        return retorno;
    }

    static public void antiguedad(){
        Scanner sc= new Scanner(System.in);
        int opc=0, dia, mes, anio;
        String nombre;

        System.out.println("Antiguedad empledado");
        do {
            System.out.println("Ingrese dia (1-30):");
            dia = sc.nextInt();
            System.out.println("Ingrese mes (1-12) :");
            mes = sc.nextInt();
            System.out.println("Ingrese anio:");
            anio = sc.nextInt();

            if ((dia >= 1) && (dia <= 30)) {
                if ((mes >= 1) && (mes <= 12)) {
                    if (anio >= 1 && anio <= 2019) {
                        if ( anio <= 2017) {
                            System.out.println("La antiguedad es superior a 2 años y 6 meses");
                        } else {
                            System.out.println("Antiguedad invalida, menor a la requerida");
                        }
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("El mes en incorrecto");
                }
            } else {
                System.out.println("El dia es incorrecto");
            }

            System.out.println("Para salir ingrese 1, Para seguir verificacando antiguedad ingrese 2");
            opc = sc.nextInt();
        }while(opc != 1);

            /*if (anio <= 2017 && mes < 6){
                retorno=true;
                System.out.println("La antiguedad es superior a 2 años y 6 meses");
                System.out.println(" ");
            }else {
                System.out.println("Antiguedad invalida, menor a la requerida");
                retorno=false;
            }


             */
    }

    static public void calculoSueldo(){
        Scanner sc= new Scanner(System.in);
        int [] meses = new int [12];

        for (int i=0; i<12; i++){
            System.out.print("\nDigite sueldo mes "+(i+1)+": ");
            meses[i]= sc.nextInt();
        }

        System.out.println("\nSueldo");
        for (int i=0; i<12; i++){
            System.out.println("Sueldo mes "+(i+1)+": "+meses[i]);
        }

        int bonificacion=1000;
        System.out.println("\nBonifiacion");
        for (int i=0; i<12; i++){
            System.out.println("Sueldo mes "+(i+1)+": "+meses[i+1000]);
        }


        /*int [] meses = {1,2,3,4,5,6,7,8,9,10,11,12};
        double sueldo=0;
        int bonificacion=1000;
        double sueldoFinal=0;
        for(int i=0;i<=12;i++){
            sueldo = sueldo + i * 1.5;
            sueldoFinal+=sueldo;
        }

        System.out.println("Sueldo: "+sueldo);
        System.out.println("Sueldo Final: "+sueldoFinal);

         */
    }

//    public static int dia() {
//        return 17;
//    }
//
//    public static int mes() {
//        return 12;
//    }
//
//    public static int anio() {
//        return 2019;
//    }
//
//    public static String leerString() {
//        return null;
//    }
//
//    public static int leerInt() {
//        return 0;
//    }
//
//    public static float leerFloat() {
//        return 0;
//    }
//
//    public static void imprimir(String texto) {
//
//    }
}

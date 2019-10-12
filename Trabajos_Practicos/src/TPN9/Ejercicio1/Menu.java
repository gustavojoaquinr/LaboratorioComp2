package TPN9.Ejercicio1;

import java.util.Scanner;

public class Menu {
    public static void sumaNaturales(Numero[] nat){
        int sumaNat=0;
        for (int x=0; x < nat.length; x++){
            if (nat[x].getTipo().equals("natural")){
            sumaNat+=nat[x].getValor1();
        }
    }
        System.out.println("Suma de numeros naturales: "+sumaNat+"\n");
    }

    public static void sumaComplejos(Numero[] com){
        float sumaCom=0, sumaComp=0;
        for (int x=0; x < com.length; x++){
            if (com[x].getTipo().equals("complejo")){
                sumaCom+=com[x].getValor1();
                sumaComp+=com[x].getValor2();
            }
        }
        System.out.println("Suma de todos los numeros complejos: "+sumaCom+", "+sumaComp+"\n");
    }

    public static void listarNaturales(Numero[] nat){
        Numero[] op=nat;
        int cont=0;
        for (int x = 0;x<op.length;x++){
            if (op[x].getTipo().equals("natural")){
                cont=x;
                for (int y=x;y<op.length;y++){
                    if (op[x].getTipo().equals("natural")){
                        if (op[x].getValor1() > op[y].getValor1() && x!=y){
                            Numero burbuja = op[x];
                            op[x]=op[y];
                            op[y]=burbuja;
                        }
                    }
                }
            }
        }
        System.out.println("\nNumeros naturales ordenados: ");
        for (int x=0;x<op.length;x++) {
            if (op[x].getTipo().equals("natural") && x==cont) {
                System.out.print((int)(op[x].getValor1()));
            }else if (op[x].getTipo().equals("natural")){
                System.out.print((int)(op[x].getValor1())+" , ");
            }

        }
    }

    public static void listarComplejos(Numero[] com){
        int cont2=0;
        System.out.println("\nNumeros complejos: ");
        for (int x=0;x<com.length;x++){
            if (com[x].getTipo().equals("complejo")) {
                cont2=x;
            }
        }
        for (int x=0;x<com.length;x++) {
            if (com[x].getTipo().equals("complejo") && cont2==x) {
                System.out.print(+com[x].getValor1()+", "+com[x].getValor2());
            }else if (com[x].getTipo().equals("complejo")){
                System.out.print(+com[x].getValor1()+", "+com[x].getValor2());
            }

        }
    }

    public static void Opciones (Numero [] array){
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do {
            System.out.println("\nQue desea realizar? 1-Suma de todos los números naturales\n" +
                    "2-Suma de todos los números complejos\n" +
                    "3-Listado de número naturales ordenados de menor a mayor separados por una coma\n" +
                    "4-Listado de los números complejos\n" + "5-Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Menu.sumaNaturales(array);break;
                case 2:
                    Menu.sumaComplejos(array);break;
                case 3:
                    Menu.listarNaturales(array);break;
                case 4:
                    Menu.listarComplejos(array);break;
                default: break;
            }
        } while (opc!=5);
    }

    public static void Operaciones(Numero[] array){
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do {
            System.out.println("\nDesea realizar alguna operacion entre objetos? 1-Suma 2-Resta 3-Multiplicacion 4-NO");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Que desea sumar? 1-Naturales 2-Complejos");
                    int x = sc.nextInt();
                    if (x==1){
                        Menu.listarNaturales(array);
                        System.out.println("\nIngrese que numeros naturales quiere sumar:");
                        System.out.println("Ingrese el primero numero: ");
                        int n1 = sc.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        int n2 = sc.nextInt();
                        boolean bln = false;
                        for (int z = 0; z < array.length; z++) {
                            if (array[z].getValor1() == ((double) n1) && array[z].getTipo().equals("natural")) {
                                for (int i = 0; i < array.length; i++) {
                                    if (array[i].getValor1() == ((double) n2) && array[i].getTipo().equals("natural")) {
                                        ((Natural) array[z]).sumar(array[i]);
                                        bln = true;break;
                                    }
                                }
                            }
                        }
                        if (!bln) {
                            System.out.println("Error");
                        }

                    } else if (x==2){
                        Menu.listarComplejos(array);
                        System.out.println("\nIngrese que numeros complejos quiere sumar");
                        System.out.println("Ingrese el valor real: ");
                        double n1 = sc.nextInt();
                        System.out.println("Ingrese el valor imaginario: ");
                        double n2 = sc.nextDouble();
                        System.out.println("Ingrese el valor real del segundo complejo: ");
                        double n3 = sc.nextDouble();
                        System.out.println("Ingrese el valor imaginario del segundo complejo: ");
                        double n4 = sc.nextDouble();
                        boolean bln = false;
                        for (int z = 0; z < array.length; z++) {
                            if (array[z].getValor1() == n1 && array[z].getValor2() == n2 && array[z].getTipo().equals("complejo")) {
                                for (int i = 0; i < array.length; i++) {
                                    if (array[i].getValor1() == n3 && array[i].getValor2() == n4 && array[i].getTipo().equals("complejo")) {
                                        ((Complejo) array[z]).sumar(array[i]);
                                        bln = true;break;
                                    }
                                }
                            }
                        }
                        if (!bln){
                            System.out.println("Error");
                        }
                    }else {
                        System.out.println("Error, ingrese nuevamente");
                    }
                    break;
                case 2:
                    System.out.println("Que desea restar? 1-Naturales 2-Complejos");
                    x = sc.nextInt();
                    if (x==1){
                        Menu.listarNaturales(array);
                        System.out.println("\nIngrese el primero: ");
                        int n1 = sc.nextInt();
                        System.out.println("Ingrese el segundo: ");
                        int n2 = sc.nextInt();
                        boolean bln = false;
                        for (int z = 0; z <array.length; z++) {
                            if (array[z].getValor1() == ((double) n1) && array[z].getTipo().equals("natural")) {
                                for (int i = 0; i <array.length; i++) {
                                    if (array[i].getValor1() == ((double) n2) && array[i].getTipo().equals("natural")) {
                                        ((Natural) array[z]).restar(array[i]);
                                        bln = true;break;
                                    }
                                }
                            }
                        }
                        if (!bln) {
                            System.out.println("Error");
                        }

                    } else if (x==2) {
                        Menu.listarComplejos(array);
                        System.out.println("\nIngrese el valor real: ");
                        double n1 = sc.nextInt();
                        System.out.println("Ingrese el valor imaginario: ");
                        double n2 = sc.nextDouble();
                        System.out.println("Ingrese el valor real del segundo complejo: ");
                        double n3 = sc.nextDouble();
                        System.out.println("Ingrese el valor imaginario del segundo complejo: ");
                        double n4 = sc.nextDouble();
                        boolean bln = false;
                        for (int z = 0; z <array.length; z++) {
                            if (array[z].getValor1() == n1 && array[z].getValor2() == n2 && array[z].getTipo().equals("complejo")) {
                                for (int i = 0; i < array.length; i++) {
                                    if (array[i].getValor1() == n3 && array[i].getValor2() == n4 && array[i].getTipo().equals("complejo")) {
                                        ((Complejo) array[z]).restar(array[i]);
                                        bln = true;break;
                                    }
                                }
                            }
                        }
                        if (!bln) {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println("Error, ingreso mal");
                    }
                    break;
                case 3:
                    System.out.println("\nQue desea multiplicar? 1-Naturales 2-Complejos");
                    x = sc.nextInt();
                    if (x==1){
                        Menu.listarNaturales(array);
                        System.out.println("\nIngrese el primero: ");
                        int n1 = sc.nextInt();
                        System.out.println("Ingrese el segundo: ");
                        int n2 = sc.nextInt();

                        boolean bln = false;
                        for (int z = 0; z < array.length; z++) {
                            if (array[z].getValor1() == ((double) n1) && array[z].getTipo().equals("natural")) {
                                for (int i = 0; i <array.length; i++) {
                                    if (array[i].getValor1() == ((double) n2) && array[i].getTipo().equals("natural")) {
                                        ((Natural) array[z]).multiplicar(array[i]);
                                        bln = true;break;
                                    }
                                }
                            }
                        }
                        if (!bln) {
                            System.out.println("Error");
                        }

                    } else if (x==2){
                        Menu.listarComplejos(array);
                        System.out.println("\nIngrese el valor real: ");
                        double n1 = sc.nextInt();
                        System.out.println("Ingrese el valor imaginario: ");
                        double n2 = sc.nextDouble();
                        System.out.println("Ingrese el valor real del segundo complejo: ");
                        double n3 = sc.nextDouble();
                        System.out.println("Ingrese el valor imaginario del segundo complejo: ");
                        double n4 = sc.nextDouble();
                        boolean bln = false;
                        for (int z = 0; z <array.length; z++) {
                            if (array[x].getValor1() == n1 && array[z].getValor2() == n2 && array[z].getTipo().equals("complejo")) {
                                for (int i = 0; i <array.length; i++) {
                                    if (array[i].getValor1() == n3 && array[i].getValor2() == n4 && array[i].getTipo().equals("complejo")) {
                                        ((Complejo) array[z]).multiplicar(array[i]);
                                        bln = true;break;
                                    }
                                }
                            }
                        }
                        if (!bln) {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println("Error, no ingreso correctamente");
                    }
                    break;
                default:
                    break;
            }
        }while(opc!=4);
    }
}
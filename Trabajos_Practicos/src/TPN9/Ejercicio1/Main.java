package TPN9.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int natural = 0, opc = 0;
        double primero = 0, segundo = 0;

        System.out.println("Ingrese la cantidad de numeros que desea crear:");
        int cantidad = sc.nextInt();
        Numero[] array = new Numero[cantidad];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Numero " + (i + 1));
            System.out.println("Que numero desea crear? 1-Natural 2-Complejo");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("Ingrese el numero: ");
                        natural = sc.nextInt();
                        if (natural < 0) {
                            System.out.println("Error, Ingrese nuevamente");
                        }
                    } while (natural < 1);
                    array[i] = new Natural(natural);
                    break;
                case 2:
                    System.out.println("Ingrese el primer termino");
                    primero = sc.nextDouble();
                    System.out.println("Ingrese el segundo termino");
                    segundo = sc.nextDouble();
                    array[i] = new Complejo(primero, segundo);
                    break;
                default:
                    System.out.println("Error, Ingrese nuevamente");
                    i--;
                    break;
            }
        }

        do {
            System.out.println("Que desea realizar? 1-Suma de todos los números naturales\n" +
                    "2-Suma de todos los números complejos\n" +
                    "3-Listado de número naturales ordenados de menor a mayor separados por una coma\n" +
                    "4-Listado de los números complejos\n" + "5-Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Menu.sumaNat(array);
                    break;
                case 2:
                    Menu.sumaComp(array);
                    break;
                case 3:
                    Menu.listarNaturales(array);
                    break;
                case 4:
                    Menu.listarComplejos(array);
                    break;
                default:
                    break;
            }
        } while (opc != 5);

        do {
            System.out.println("Desea realizar alguna operacion entre objetos? 1-Suma 2-Resta 3-Multiplicacion 4-NO");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Suma de naturales o complejos? 1-Naturales 2-Complejos");
                    int operacion = sc.nextInt();
                    if (operacion == 1) {
                        Menu.listarNaturales(array);
                        System.out.println("Ingrese cuales quiere sumar:");
                        System.out.println("Ingrese el primero: ");
                        int n1 = sc.nextInt();
                        System.out.println("Ingrese el segundo: ");
                        int n2 = sc.nextInt();

                        boolean check = false;
                        for (int x = 0; x < cantidad; x++) {
                            if (array[x].getValor1() == ((double) n1) && array[x].getTipo().equals("natural")) {
                                for (int i = 0; i < cantidad; i++) {
                                    if (array[i].getValor1() == ((double) n2) && array[i].getTipo().equals("natural")) {
                                        ((Natural) array[x]).sumar(array[i]);
                                        check = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!check) {
                            System.out.println("Error");
                        }

                    } else if (operacion == 2) {
                        Menu.listarComplejos(array);
                        System.out.println("Ingrese cuales quiere sumar");
                        System.out.println("Ingrese el valor real del primer complejo: ");
                        double n1 = sc.nextInt();
                        System.out.println("Ingrese el valor imaginario del primer complejo: ");
                        double n2 = sc.nextDouble();
                        System.out.println("Ingrese el valor real del segundo complejo: ");
                        double n3 = sc.nextDouble();
                        System.out.println("Ingrese el valor imaginario del segundo complejo: ");
                        double n4 = sc.nextDouble();

                        boolean check = false;
                        for (int x = 0; x < cantidad; x++) {
                            if (array[x].getValor1() == n1 && array[x].getValor2() == n2 && array[x].getTipo().equals("complejo")) {
                                for (int i = 0; i < cantidad; i++) {
                                    if (array[i].getValor1() == n3 && array[i].getValor2() == n4 && array[i].getTipo().equals("complejo")) {
                                        ((Complejo) array[x]).sumar(array[i]);
                                        check = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!check) {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println("Ingreso fallido");
                    }
                    break;
                case 2:
                    System.out.println("Resta entre naturales o complejos? 1-Naturales 2-Complejos");
                    operacion = sc.nextInt();
                    if (operacion == 1) {
                        Menu.listarNaturales(array);
                        System.out.println("Ingrese el primero: ");
                        int n1 = sc.nextInt();
                        System.out.println("Ingrese el segundo: ");
                        int n2 = sc.nextInt();

                        boolean check = false;
                        for (int x = 0; x < cantidad; x++) {
                            if (array[x].getValor1() == ((double) n1) && array[x].getTipo().equals("natural")) {
                                for (int i = 0; i < cantidad; i++) {
                                    if (array[i].getValor1() == ((double) n2) && array[i].getTipo().equals("natural")) {
                                        ((Natural) array[x]).restar(array[i]);
                                        check = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!check) {
                            System.out.println("Error");
                        }

                    } else if (operacion == 2) {
                        Menu.listarComplejos(array);
                        System.out.println("Resta:");
                        System.out.println("Ingrese el valor real del primer complejo: ");
                        double n1 = sc.nextInt();
                        System.out.println("Ingrese el valor imaginario del primer complejo: ");
                        double n2 = sc.nextDouble();
                        System.out.println("Ingrese el valor real del segundo complejo: ");
                        double n3 = sc.nextDouble();
                        System.out.println("Ingrese el valor imaginario del segundo complejo: ");
                        double n4 = sc.nextDouble();


                        boolean check = false;
                        for (int x = 0; x < cantidad; x++) {
                            if (array[x].getValor1() == n1 && array[x].getValor2() == n2 && array[x].getTipo().equals("complejo")) {
                                for (int i = 0; i < cantidad; i++) {
                                    if (array[i].getValor1() == n3 && array[i].getValor2() == n4 && array[i].getTipo().equals("complejo")) {
                                        ((Complejo) array[x]).restar(array[i]);
                                        check = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!check) {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println("Ingreso fallido.");
                    }
                    break;
                case 3:
                    System.out.println("Multiplicacion de 1-Naturales 2-Complejos");
                    operacion = sc.nextInt();
                    if (operacion == 2) {
                        Menu.listarNaturales(array);
                        System.out.println("Entre cuales realizara la multiplicacion?");
                        System.out.println("Ingrese el primero: ");
                        int n1 = sc.nextInt();
                        System.out.println("Ingrese el segundo: ");
                        int n2 = sc.nextInt();

                        boolean check = false;
                        for (int x = 0; x < cantidad; x++) {
                            if (array[x].getValor1() == ((double) n1) && array[x].getTipo().equals("natural")) {
                                for (int i = 0; i < cantidad; i++) {
                                    if (array[i].getValor1() == ((double) n2) && array[i].getTipo().equals("natural")) {
                                        ((Natural) array[x]).multiplicar(array[i]);
                                        check = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!check) {
                            System.out.println("Error");
                        }

                    } else if (operacion == 2) {
                        Menu.listarComplejos(array);
                        System.out.println("Entre cuales realizara la multiplicacion?");
                        System.out.println("Ingrese el valor real del primer complejo: ");
                        double n1 = sc.nextInt();
                        System.out.println("Ingrese el valor imaginario del primer complejo: ");
                        double n2 = sc.nextDouble();
                        System.out.println("Ingrese el valor real del segundo complejo: ");
                        double n3 = sc.nextDouble();
                        System.out.println("Ingrese el valor imaginario del segundo complejo: ");
                        double n4 = sc.nextDouble();


                        boolean check = false;
                        for (int x = 0; x < cantidad; x++) {
                            if (array[x].getValor1() == n1 && array[x].getValor2() == n2 && array[x].getTipo().equals("complejo")) {
                                for (int i = 0; i < cantidad; i++) {
                                    if (array[i].getValor1() == n3 && array[i].getValor2() == n4 && array[i].getTipo().equals("complejo")) {
                                        ((Complejo) array[x]).multiplicar(array[i]);
                                        check = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!check) {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println("Ingreso fallido");
                    }
                    break;
                default:
                    break;
            }
        }while(opc!=4);
    }
}

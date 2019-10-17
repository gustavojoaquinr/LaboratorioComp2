package TFI01;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        Sala s1 = new Sala("Jocker", "Sala01");

        s1.ingresarCapacidad();

        do{
            System.out.println("Ingrese 1 para cargar espectadores");
            System.out.println("Ingrese 2 para listar espectadores");
            System.out.println("Ingrese 5 para salir");
            opc=sc.nextInt();

            switch(opc){
                case 1: s1.cargarEspectadores();break;
                case 2: s1.listarEspectadores();break;
                default:break;
            }

        }while(opc!=5);



    }
}

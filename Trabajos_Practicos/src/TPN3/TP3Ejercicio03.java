package TPN3;

import java.util.Scanner;

public class TP3Ejercicio03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nombre="";
        int dni;
        int edad;

        TP3Ejercicio03_Personas p[][] = new TP3Ejercicio03_Personas[2][2];

        for(int filas=0;filas<2; filas++){
            for (int col=0;col<2;col++){
                System.out.println("Ingresa el nombre");
                nombre = s.nextLine();
                System.out.println("Ingresa el dni");
                dni = s.nextInt();
                System.out.println("Ingresa la edad");
                edad = s.nextInt();
                System.out.println(" ");
                s.nextLine();

                TP3Ejercicio03_Personas Personas = new TP3Ejercicio03_Personas(nombre,dni,edad);
                p[filas][col] = Personas;
            }
            //p[i] = new TP3Ejercicio03_Personas(nombre,dni,edad);
        }

        for(int filas=0;filas<2; filas++) {
            for (int col = 0; col < 2; col++) {
                System.out.println("NOMBRE: "+p[filas][col].getNombre());
                System.out.println("DNI: "+p[filas][col].getDni());
                System.out.println("EDAD: "+p[filas][col].getEdad());
                System.out.println("");
            }
        }
    }
}

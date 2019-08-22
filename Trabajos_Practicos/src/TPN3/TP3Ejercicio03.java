package TPN3;

import java.util.Scanner;

public class TP3Ejercicio03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String [][] Personas = new String[3][3];

        //Cargar la matriz con datos de las personas
        for (int i=0; i<3; i++){
            System.out.println("Ingrese Persona numero "+ (i+1));
            System.out.println("(Nombre - Dni - Edad):");
            for (int j=0; j<3; j++){
                Personas[j][i] = s.next();
            }
        }

        //Ordenar por orden alfabetico
        for (int x=0; x<3-1; x++){
            for (int y=x+1; y<3; y++){
                if (Personas[0][x].compareTo(Personas[0][y])>0){
                    for (int z=0; z<3; z++){
                        String aux = Personas[z][x];
                        Personas[z][x] = Personas[z][y];
                        Personas[z][y] = aux;
                    }
                }
            }
        }

        System.out.println(" ");
        //Mostrar la matriz
        for (String[] Fila:Personas) {
            for (String Elemento:Fila) {
                System.out.print(" ¦" +Elemento+ "¦\t\t\t\t");
            }
            System.out.println(" ");
        }

    }
}

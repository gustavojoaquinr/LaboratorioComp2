package TPN6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int cantidad = 0, longitud = 0;

        do{
            System.out.println("\nIngrese la cantidad de contraseñas a crear: ");
            cantidad = sc.nextInt();
            System.out.println("Ingrese la longitud de las contraseñas: ");
            longitud = sc.nextInt();
            if(cantidad < 1){
                System.out.println("Error. La cantidad de contraseñas es invalida");
            }
            if(longitud < 1 ){
                System.out.println("Error. La longitud de las contraseñas es invalida");
            }
            System.out.println(" ");

        }while (longitud < 1  || cantidad < 1);

        CreadorContrasenas contra = new CreadorContrasenas(cantidad, longitud);
        //Crear, Mostrar y Evaluar Contraseñas
        contra.GenerarContrasenas();
        contra.Mostrar();
    }

}
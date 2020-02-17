package Progi.Repaso;

import java.util.Scanner;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        int arreglo[] = {4,1,5,2,3};
        boolean band= false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero a buscar: ");
        int dato = sc.nextInt();


        int i=0;
        while(i<5 && band==false){
            if(arreglo[i] == dato){
                band = true;
            }
            i++;
        }

        if(band == false){
            System.out.println("\nEl numero no se encuentra en el arreglo");
        }
        else{
            System.out.println("\nEl numero ha sido encontrado en la posicion "+(i-1));

        }

    }
}

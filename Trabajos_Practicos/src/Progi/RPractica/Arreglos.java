package Progi.RPractica;

import javax.swing.*;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int [] k = new int [3];
        k[0]=5;
        k[1]=6;
        k[2]=7;
        for(int i=0; i<3; i++){
            System.out.println(k[i]);
        }

        int nElementos;

        nElementos=Integer.parseInt(JOptionPane.showInputDialog("\n\ningrese la cantidad de elementos: "));
        char [] letras = new char[nElementos];
        System.out.println("Digite los elementos del arreglo ");
        for(int i=0;i<nElementos;i++){ //.length
            System.out.print((i+1)+"- Digite un caracter: ");
            letras[i]=entrada.next().charAt(0);
        }
        System.out.println(" Los caracteres del arreglo son : ");

        for(int i=0; i<nElementos; i++){
            System.out.println(letras[i]);
        }

        System.out.println("\nBUCLE FOR EACH");
        String[] nombres = {"Alejandro", "Bruno","Carlos"};
        for(String i: nombres){
            System.out.println(i);//"Nombres:"+i
        }

        System.out.println("\nImprimiendo elementos del arreglo de forma inversa: ");
        for(int i=2; i>=0; i--) {
            System.out.println(k[i]);
        }


    }
}

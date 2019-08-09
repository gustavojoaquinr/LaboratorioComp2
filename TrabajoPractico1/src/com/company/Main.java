package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int edad;
        String nombre;

        do{
            System.out.println("Ingrese su nombre:");
            nombre = s.next();
            System.out.println("Ingrese su edad:");
            edad=s.nextInt();
            if(edad >= 18){
                System.out.println(nombre + "" + " es mayor de edad");
            }else if (edad >= 1 && edad <=17){
                System.out.println(nombre + "" + " es menor de edad");
            }
            System.out.println(" ");
        }while(edad!=0);
    }
}

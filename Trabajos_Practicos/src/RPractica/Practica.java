package RPractica;

import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2, suma, resta, division, multiplicacion;

        System.out.println("Digite 1 numero: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite otro numero: ");
        n2 = entrada.nextFloat();

        suma = n1 + n2;
        resta = n1 - n2;
        division = n1/n2;
        multiplicacion = n1 * n2;

        System.out.println("La suma es: "+suma+"\nLa resta es: "+resta+"\nLa division es: "+division+"\nLa multiplicacion es: "+multiplicacion);




        System.out.println("\nADIVINAR NUMERO ALEATORIO");
        int numero,aleatorio,contador=0;
        aleatorio = (int)(Math.random()*100);
        //System.out.println(aleatorio);

        do{
            System.out.println("Digite un numero: ");
            numero = entrada.nextInt();

            if(aleatorio>numero){
                System.out.println("\nEL NUMERO ES MAYOR");
            }
            else{
                System.out.println("\nEL NUMERO ES MENOR");
            }
            contador++;

        }while(numero != aleatorio);

        System.out.println("Adivinaste el numero en "+contador+" intentos");

        int numer=0, elementos=0,sumatoria=0;
        float media;

        System.out.println("\nCALCULAR PROMEDIO DE N NUMEROS hasta llegar a un negativo");
        System.out.println("\nDigite un numero");
        numer = entrada.nextInt();

        while(numer>=0){
            sumatoria += numer;
            elementos++;

            System.out.println("\nDigite otro numero");
            numer = entrada.nextInt();
        }

        if(elementos==0){
            System.out.println("Error, la division entre cero no existe");
        }
        else{
            media = (float)suma/elementos;
            System.out.println("La media es: "+media);
        }

        System.out.println("\nDETERMINAR SI UNA LETRA ES MAYUSCULA O NO");

        char letra;

        System.out.println("Digite una letra: ");
        letra = entrada.next().charAt(0);

        if(Character.isUpperCase(letra)){
            System.out.println("La letra ingresada "+letra+" es MAYUSCULA");
        }
        else{
            System.out.println("La letra ingresada "+letra+" es MINUSCULA");
        }

    }
}

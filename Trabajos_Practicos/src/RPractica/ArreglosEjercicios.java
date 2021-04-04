package RPractica;

import java.util.Scanner;

public class ArreglosEjercicios {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float numeros[] = new float[5];
        float sumapositivos=0, sumanegativos=0, mediaP, mediaN;
        int cont_p=0, cont_n=0, cont_ceros=0;

        System.out.println("Guardando los numeros en el arreglo");
        for(int i=0; i<numeros.length; i++){
            System.out.print((i+1)+" . Digite u numero: ");
            numeros[i] = s.nextFloat();

            if(numeros[i] == 0){
                cont_ceros++;
            }
            else if (numeros[i] > 0){
                sumapositivos += numeros[i];
                cont_p++;
            }
            else{
                sumanegativos += numeros[i];
                cont_n++;
            }
        }

        //Media numeros positivos
        if(cont_p == 0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        }
        else{
            mediaP = sumapositivos/cont_p;
            System.out.println("La media de los numeros positivos es: "+mediaP);
        }
        //Media numeros negativos
        if(cont_n == 0){
            System.out.println("No se puede sacar la media de los numeros negativos");
        }
        else{
            mediaN = sumanegativos/cont_n;
            System.out.println("La media de los numeros negativos es: "+mediaN);
        }
        System.out.println("La cantidad de ceros es: "+cont_ceros);


        int enteros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite un número: ");
            enteros[i] = s.nextInt();
        }

        int p = 0; //primero
        int u = 9; //ultimo

        for (int i = 0; i < 5; i++) {
            System.out.println(enteros[p]);
            System.out.println(enteros[u]);
            p+=1; //suma la siguiente posición respecto del primero
            u-=1; //resta una posición respecto del último
        }

        //MEZCLAR 2 ARREGLOS
        int a[], b[], c[];
        a = new int [10];
        b = new int [10];
        c = new int [20];

        System.out.println("Digite el primer arreglo: ");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+" . Digite un numero: ");
            a[i] = s.nextInt();
        }

        System.out.println("\nDigite el segundo arreglo: ");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+" . Digite un numero: ");
            b[i] = s.nextInt();
        }

        int j=0;
        for(int i=0; i<10; i++){
            c[j] = a[i]; //1 A,  2 A etc
            j++;
            c[j] = b[i]; //1 B
            j++;
        }

        System.out.println("\nEl arreglo c es: ");
        for(int i=0; i<20; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();


        /*
            Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados crecientemente.
            Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
         */

        int arreglo1[] = new int [10];
        int arreglo2[] = new int [10];
        int arreglo3[] = new int [20];
        boolean creciente = true;

        System.out.println("Datos del primer arreglo");
        //Llenado del primer arreglo arreglo
        do{
            for (int i=0; i<10;i++){
                System.out.print((i+1)+". Digite un numero: ");
                arreglo1[i]=s.nextInt();
            }
            //Comprobar si el arreglo esta de forma creciente
            for (int i=0; i<9;i++){
                if(arreglo1[i]<arreglo1[i+1]){//Ordenado de forma creciente 1-2-3...
                    creciente=true;
                }
                if(arreglo1[i]>arreglo1[i+1]){//Ordenado de forma decreciente 3-2-1...
                    creciente=false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("El arreglo no esta en forma creciente, digite de nuevo los números");
            }
        }while(creciente==false);

        //Llenando el segundo arreglo
        System.out.println("\nDatos del segundo arreglo");
        do{
            for(int i=0;i<10;i++){
                System.out.print((i+1)+". Digite un numero: ");
                arreglo2[i]=s.nextInt();
            }
            //Comprobamos que este de forma creciente
            for (int i=0;i<9;i++){
                if(arreglo2[i]<arreglo2[i+1]){
                    creciente=true;
                }
                if(arreglo2[i]>arreglo2[i+1]){
                    creciente=false;
                    break;
                }
            }
            if(creciente==false){
                System.out.println("El arreglo no esta en forma creciente, digite de nuevo los números");
            }
        }while(creciente==false);

        //Se realiza el tercer arreglo combinando el arreglo1 y arreglo2
        //Se crean iteradores
        int d=0,f=0,h=0;

        while(d<10 && f<10){ //Cuando A se menor a 10 y ademas B menor a 10
            if (arreglo1[d] < arreglo2[f]){ //Cuando arreglo1 sea menor que arreglo2
                arreglo3[h]=arreglo1[d];
                d++;//para la siguiente posición de A
                h++;//para la siguiente posición de C
            }
            else{//Cuando arreglo2 sea menor que arreglo1
                arreglo3[h]=arreglo2[f];
                f++;//para la siguiente posición de B
                h++;//para la siguiente posición de C
            }
        }
        //resto de arreglo1 y arreglo2
        if(d==10){ //si A es igual a 10
            while(f<10){
                arreglo3[h]=arreglo2[f];
                f++;
                h++;
            }
        }
        else{
            while(d<10){
                arreglo3[h]=arreglo1[d];
                d++;
                h++;
            }
        }

        //Tercer arreglo
        System.out.println("\nEl tercer arreglo queda de la siguiente forma:");
        for(int i=0;i<20;i++){
            System.out.print(arreglo3[i]+" - ");
        }
        System.out.println();



    }
}

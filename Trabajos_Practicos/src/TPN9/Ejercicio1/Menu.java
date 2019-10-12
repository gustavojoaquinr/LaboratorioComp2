package TPN9.Ejercicio1;

import java.util.Scanner;

public class Menu {
    public static void sumaNat(Numero[] nat){
    int sumaNaturales=0;

        for (int x=0; x < nat.length; x++){
        if (nat[x].getTipo().equals("natural")){
            sumaNaturales+=nat[x].getValor1();
        }
    }
        System.out.println("Suma de numeros naturales: "+sumaNaturales+"\n");
}
    public static void sumaComp(Numero[] com){
        float sumaComplejos1=0, sumaComplejos2=0;
        for (int x=0; x < com.length; x++){
            if (com[x].getTipo().equals("complejo")){
                sumaComplejos1+=com[x].getValor1();
                sumaComplejos2+=com[x].getValor2();
            }
        }
        System.out.println("Suma de todos los numeros complejos: "+sumaComplejos1+", "+sumaComplejos2+"\n");
    }

    public static void listarNaturales(Numero[] nat){
        Numero[] operar= nat;
        int contadorN=0;
        for (int x = 0;x<operar.length;x++){
            if (operar[x].getTipo().equals("natural")){
                contadorN=x;
                for (int y=x;y<operar.length;y++){
                    if (operar[x].getTipo().equals("natural")){
                        if (operar[x].getValor1() > operar[y].getValor1() && x!=y){
                            Numero burbuja = operar[x];
                            operar[x]=operar[y];
                            operar[y]=burbuja;
                        }
                    }
                }
            }
        }
        System.out.println("\nLos numeros naturales ordenados son: ");
        for (int x=0;x<operar.length;x++) {
            if (operar[x].getTipo().equals("natural") && x==contadorN) {
                System.out.print((int)(operar[x].getValor1()));
            }else if (operar[x].getTipo().equals("natural")){
                System.out.print((int)(operar[x].getValor1())+" , ");
            }

        }
    }
    public static void listarComplejos(Numero[] com){
        int contadorC=0;
        System.out.println("\nLos numeros complejos son: ");
        for (int x=0;x<com.length;x++){
            if (com[x].getTipo().equals("complejo")) {
                contadorC=x;
            }
        }
        for (int x=0;x<com.length;x++) {
            if (com[x].getTipo().equals("complejo") && contadorC==x) {
                System.out.print(+com[x].getValor1()+", "+com[x].getValor2());
            }else if (com[x].getTipo().equals("complejo")){
                System.out.print(+com[x].getValor1()+", "+com[x].getValor2());
            }

        }
    }
}
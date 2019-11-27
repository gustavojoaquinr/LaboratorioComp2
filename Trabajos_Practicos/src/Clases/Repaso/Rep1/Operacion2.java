package Clases.Repaso.Rep1;

public class Operacion2 {

    public int sumar(int a, int b){
        int suma = a + b;
        return suma;
    }

    public int restar(int a, int b){
        int resta = a - b;
        return resta;
    }

    public int multiplicar(int a, int b){
        int multiplicacion = a * b;
        return multiplicacion;
    }

    //con return segunda forma
    public void mostrar(int suma, int resta, int multiplicacion){
        System.out.println("\nLa suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
    }

}

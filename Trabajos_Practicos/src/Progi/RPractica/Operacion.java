package Progi.RPractica;

public class Operacion {
    int suma;
    int resta;
    //String nombre;


    public void sumar(int a, int b){
        suma = a + b;
    }

    public void restar(int a, int b){
        resta = a - b;
    }

    public void MostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
    }

    public int sumar2 (int a, int b){
        int suma = a+b;
        return suma;
    }
    public int restar2 (int a, int b){
        int resta = a-b;
        return resta;
    }

    public String saludar(String nombre){
        String saludo = "Hola "+nombre;
        return saludo;
    }

    public void MostrarResultados2(int suma, int resta){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
    }

}



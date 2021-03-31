package Progi.RPractica;

public class Coche {
    String color;
    String marca;
    int km;

    //metodo
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.color = "blanco";
        coche1.marca = "audi";
        coche1.km = 0;

        System.out.println("El color del coche1 es: "+coche1.color);
    }
}

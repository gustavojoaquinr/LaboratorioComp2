package TPN9.Ejercicio1;

import java.util.Scanner;

public class Natural extends Numero implements INumeros {
    int num;

    public Natural(int num) {
        this.num = num;
    }

    @Override
    public void sumar(Numero a) {
        System.out.println("Resultado de la suma: "+(this.num+(((Natural)a).num)));
    }

    @Override
    public void restar(Numero a) {
        System.out.println("Resultado de la resta: "+(this.num- ((Natural)a).num));
    }

    @Override
    public void multiplicar(Numero a) {
        System.out.println("Resultado de la multiplicacion; "+(this.num*(((Natural)a).num)));
    }

    @Override
    public double getValor1() {
        return this.num;
    }

    @Override
    public double getValor2() {
        return 0;
    }

    public String getTipo() {
        return "natural";
    }

    public void getNumero() {
        System.out.print(this.num + ",");
    }

    public void setNumero(int num) {
        this.num = num;
    }

    public static void crearNaturales(int naturales, Natural nat[]) {
        for (int i = 0; i < naturales; i++) {
            int num;
            num = Natural.controlNaturales();
            nat[i] = new Natural(num);
        }
    }

    public static int controlNaturales(){
        Scanner sc = new Scanner(System.in);
        int num =0;
        try{
            System.out.println("Ingrese numeros Naturales:");
            num=sc.nextInt();
        }catch (Exception e){
            System.out.println("No ha ingresado un numero, volver a ingresar");
            controlNaturales();
        }
        return num;
    }

    public static void verNaturales (int naturales, Natural array []){
        for (int i=0;i<naturales;i++){
            array [i].getNumero();
        }
    }



}
package TPN9.Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Complejo extends Numero implements INumeros {
    double num1, num2;
    public Complejo(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

    public Complejo(int num) {
        super();
    }

    @Override
    public void sumar(Numero a) {
        System.out.println("Resutlado de la suma: ("+(this.num1+a.getValor1())+", "+(this.num2+a.getValor2())+")");
    }

    @Override
    public void restar(Numero a) {
        System.out.println("Resutlado de la resta: ("+(this.num1-a.getValor1())+", "+(this.num2-a.getValor2())+")");
    }

    @Override
    public void multiplicar(Numero a) {
        System.out.println("Resultado de la multiplicacion: ("+((this.num1*a.getValor1())-(this.num2*a.getValor2()))+", "+((this.num2*a.getValor1())+this.num1*a.getValor2())+")");
    }

    @Override
    public double getValor1() {
        return this.num1;
    }

    @Override
    public double getValor2() {
        return this.num2;
    }

    public String getTipo() {
        return "complejo";
    }

    public void getNumero() {
        System.out.print(this.num1+",");
    }

    public void setNumero(int num1) {
        this.num1 = num1;
    }

    public static void crearComplejo(Complejo com[], int complejos){
        int num;
        for (int i=0;i<complejos;i++){
            num = Complejo.controlComplejos();
            com [i] = new Complejo(num);
        }
    }

    public static int controlComplejos(){
        Scanner sc = new Scanner(System.in);
        int num=0;
        try{
            System.out.println("Ingrese numeros Complejos: ");
            num=sc.nextInt();
        }catch (Exception e){
            System.out.println("No ha ingresado un numero, volver a ingresar");
            controlComplejos();
        }
        return num;
    }

    public static void verComplejos(int complejos, Complejo com[]){
        Arrays.sort(com);
        for (int i=0;i<complejos;i++){
            com [i].getNumero();
        }
    }



}

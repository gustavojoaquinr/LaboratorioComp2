package Progi.Parcial1;

import java.util.Scanner;

public class Main {

    public static int[] precios= {90,80,75,105};
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double ganancia=0;
        int codigoCerveza;
        double litros;
        double litrosTotales=0;
        double[] litrosPorDia= {2000,1500,3000,2500};
        int DNI=123456789;
        String PASS="123";
        Scanner sc= new Scanner(System.in);


        boolean validado=validacion(DNI, PASS);
        if(validado) { //Una estructura if para chequear el resultado de la funcion que valida el dni y su password.

            boolean terminar=false;
            do { //do while, ya que el primer ingreso de datos siempre se va a realizar, ya sea para registrar una venta o salir del programa.
                System.out.println("Ingrese los litros vendidos: ");
                litros=sc.nextDouble();
                System.out.println("Para salir ingrese 0 \"cero\" de lo contrario ingrese el codigo de la cerveza: ");
                codigoCerveza=sc.nextInt();
                switch (codigoCerveza) {  //swich para poder seleccionar el precio asociado de un tipo de cerveza, el precio se guarda en un vector.
                    case 1:
                        if(litrosPorDia[0]>0) {//el if controla que la cantida de cerveza disponible sea mayor de 0, de lo contrario imprime que no queda mas de dicha cerveza

                            if((litrosPorDia[0]-litros)<0){ //El if valida que la venta ingresada sea posible, ya que si en stock existe una menor cantida de cerveza la venta no podra realizarce, entonces el programa
                                //en lugar de vender los litros ingresados, vende el total que le queda de la misma.
                                ganancia=ganancia+(litrosPorDia[0]*precios[0]);
                                litrosTotales=litrosTotales+litrosPorDia[0];
                                litrosPorDia[0]=0;
                            }else {//En caso de que haya mas cerveza de la que se vende, la venta se realiza de forma normal
                                ganancia=ganancia+(litros*precios[0]);
                                litrosTotales=litrosTotales+litros;
                                litrosPorDia[0]=litrosPorDia[0]-litros;

                            }


                        }else{
                            System.out.println("No tenemos mas de este tipo de cerveza!!.");
                        }


                        break;
                    case 2:
                        if(litrosPorDia[1]!=0) {
                            if((litrosPorDia[1]-litros)<0){
                                ganancia=ganancia+(litrosPorDia[1]*precios[1]);
                                litrosTotales=litrosTotales+litrosPorDia[0];
                                litrosPorDia[1]=0;

                            }else {
                                ganancia=ganancia+(litros*precios[1]);
                                litrosTotales=litrosTotales+litros;
                            }

                        }else{
                            System.out.println("No tenemos mas de este tipo de cerveza!!.");
                        }
                        break;
                    case 3:
                        if(litrosPorDia[2]!=0) {
                            if((litrosPorDia[1]-litros)<2){
                                ganancia=ganancia+(litrosPorDia[2]*precios[2]);
                                litrosTotales=litrosTotales+litrosPorDia[2];
                                litrosPorDia[2]=0;

                            }else {
                                ganancia=ganancia+(litros*precios[2]);
                                litrosTotales=litrosTotales+litros;
                            }

                        }else{
                            System.out.println("No tenemos mas de este tipo de cerveza!!.");
                        }

                        break;
                    case 4:
                        if(litrosPorDia[3]!=0) {
                            if((litrosPorDia[3]-litros)<0){
                                ganancia=ganancia+(litrosPorDia[3]*precios[3]);
                                litrosTotales=litrosTotales+litrosPorDia[3];
                                litrosPorDia[3]=0;

                            }else {
                                ganancia=ganancia+(litros*precios[3]);
                                litrosTotales=litrosTotales+litros;
                            }

                        }else{
                            System.out.println("No tenemos mas de este tipo de cerveza!!.");
                        }

                        break;

                    case 0:
                        terminar=true;
                        break;
                    default:
                        System.out.println("A ingresado un codigo de cerveza no valido, por lo tanto no se realizara ninguna acci�n.");
                        break;
                }
                if(litrosTotales>=5000){  //valida si la cantidad de litros totales vendidos sean mayor o igual a 5 mil
                    terminar=true;		//En caso de que lo sea se cambia la condicion de salida a true. De lo contrario no hace nada
                }

            }while(!terminar); //conicion de salida del  bucle do while.

            System.out.println("Las ganancias del d�a son: "+ganancia); //Impresion de las ganancias


        }else {
            System.out.println("La contrase�a o el numero de DNI son incorrectos. Validacion erronea");
        }

    }

    static public boolean validacion(int DNI, String PASS) {
        Scanner sc= new Scanner(System.in);

        boolean retorno=false;
        for(int i=0; i<5; i++) {
            System.out.println("Ingrese su numero de DNI: ");
            int dni=sc.nextInt();
            System.out.println("Ingrese su contrase�a: ");
            String pass=sc.next();

            if(dni==DNI && pass.equals(PASS)) {
                retorno=true;
                System.out.println("Autenticado con exito!!!.");
                System.out.println("");
                System.out.println("");
                break;
            }else {
                System.out.println("El usuario no es v�lido. Vuelva a ingresar los datos!!");
            }

        }

        return retorno;
    }

}
//FUNCION VALIDACION: En esta funcion utilice un ciclo "for" para contar la cantidad de intentos
//erroneos que el cliente tenga, ya que la consiga dice que solo tiene 5 intentos de validacion, como
// conosco la cantidad de iteraiones maximas que se pueden realizar utilizo el for".
//dentro de la funcion tengo una variable del tipo boolean inicializada en false  y estructura de
//control "if", la estructura de control "if" valida que el dni y la pass pasadas por parametros sean
//iguales a dos constantes definidas al inicio del programa, en caso de que la condicion de verdadera
//se cambia la varaible boolean de false a true y se sale del bucle mediante un break, en caso contrario
//no se ha ce nada y al llegar a los 5 intentos se devuelve el valor predeterminado de la variable
//booleana la cual es false.

//4) Un error de ejecucion es aquel que cuando se escribe el codigo, parece que todo esta bien y no se detecta
//el error, pero cuando se ejecuta, este proceso no puede realizarse. Un ejemplo claro es la divicion por cero,
// ArithmeticException: / by zero

//Un error de compilacion a diferencia del de ejecucion, si se puede detectar antes de que se ejecute
//el programa, como por ejemplo, llamar una funcion que recibe parametros y no pasarle ninguno, o
//pasarle los parametros incorrectos, un ejemplo seria pasarle enteros a una funcion que solo recibe Strings




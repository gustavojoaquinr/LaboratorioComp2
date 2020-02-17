package Progi.Parcial2;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int [] totalGeneral= new int[1000];
        int op,i=0;
        //Creo un nuevo objeto de clase Persona
        Personaparcial2 p1 = new Personaparcial2();
        //Cargo sus atributos
        mostrar("Cargue sus datos personales");//Carga de los datos del usuario
        mostrar("Ingrese Su nombre");
        //Uso los setters para darle el valor al atributo que es privado
        p1.setNombre(input.next());//Carga el nombre
        mostrar("Ingrese su apellido");
        p1.setApellido((input.next()));
        mostrar("Ingrese su DNI ");
        p1.setDni(input.nextInt());
        mostrar("Ingrese si es la primera vez en el parque");
        mostrar("0 si es si primera vez");
        mostrar("1 si ya ha visitado anteriormente el parque");
        p1.setPrimeraVez(input.nextInt());
        //Imprimir nombre completo del usuario
        mostrar("");
        mostrar("Nombre completo del usuario :"+p1.obtenerNombreCompleto()+"");
        mostrar("");
        do{
            //Consideré que los totales eran de la encuesta
            totalGeneral[i]=cargarEncuesta();
            mostrar("Desea cargar otra encuesta?");
            mostrar("Ingrese 1 para volver a cargar");
            mostrar("Ingrese -1 para salir");
            op=input.nextInt();
            i++;//Uso para ir avanzando el indice en el total general
        }while(op!=-1);

        mostrar("Desea obtener informe de totales Generales?");
        mostrar("Ingrese 1 para SI //  2 para NO");
        op=input.nextInt();
        if(op==1){
            ObtenerTotalGeneral(totalGeneral);
        }

    }


    public static int cargarEncuesta(){
        int [][]encuesta = new int[5][5];
        for (int i=0;i<3;i++){
            mostrar("--Atraccion A"+(i+1)+" :");
            mostrar("Ingrese las calificaciones (con valores del 1 al 10) de los siguientes aspectos");
            mostrar("Grado de diversion (1- Aburrrida / 10-Muy diverida) :");
            encuesta[i][0]=input.nextInt();
            mostrar("Calidad de atraccion:");
            mostrar("1-Poca Calidad / 10-Calidad Alta");
            mostrar("Si la atraccion incluye caracteristicas que la resalten :");
            encuesta[i][1] =input.nextInt();
            mostrar("Justicia del precio");
            mostrar("Le parecio justo el costo de entrada? ");
            mostrar("1-Muy injusto/10-Justo");
            encuesta[i][2]=input.nextInt();
            mostrar("Atencion recibida por los empleados");
            mostrar("Le parecio amigable la atencion de los empleados? ");
            mostrar("1-Nada Amable/10-Muy Amable");
            encuesta[i][3]=input.nextInt();
        }
        //Sumar totales
        for(int i=0;i<4;i++){
            for(int x=0;x<4;x++){
                encuesta[i][4]+=encuesta[i][x];
            }
            encuesta[4][4]+=encuesta[i][4];//Total General
        }
        //Mostrar totales
        mostrar("Calificacion total de la atraccion 1: ");
        System.out.println(encuesta[0][4]);
        mostrar("Calificacion total de la atraccion 2: ");
        System.out.println(encuesta[1][4]);
        mostrar("Calificacion total de la atraccion 3: ");
        System.out.println(encuesta[2][4]);

        return encuesta[4][4];//devolver el total general de la encuesta
    }

    //Ejercicio3
    static void ObtenerTotalGeneral(int[]totalGeneral){
        bubbleSort(totalGeneral);//Ordeno el Arreglo
        mostrar("INFORME DE TOTALES ");
        for (int x=0;x<totalGeneral.length;x++){
            System.out.println("total "+ (x+1) +": "+totalGeneral[x]);
        }
    }


    //metodo para imprimir texto
    static void mostrar(String p){
        System.out.println(p);
    }

    //Decidi usar el metodo de ordenamiento por burbuja
    //ya que es con el que mas familiarizado estoy
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}
package TPN3;

public class TP3Ejercicio01 {
    public static void main(String[] args) {

        int[] array = new int [100];

        for(int i=0; i<100; i++) {
            array[i]=(int)(Math.random()*100);
        }

        for(int elemento:array) {
            System.out.print(elemento+"\n");
        }
    }
}

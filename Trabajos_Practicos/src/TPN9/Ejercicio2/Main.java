package TPN9.Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Edificio> lista = new ArrayList<Edificio>();
        Edificio p1 = new Polideportivo("San Martin",1,2.0445, 8);
        Edificio p2 = new Polideportivo("Belgrano",2,2.4585,9);
        Edificio p3 = new Polideportivo("Peron", 3,1.2596,15);
        Edificio o1 = new Oficinas(4,500);
        Edificio o2 = new Oficinas(2,400);
        Edificio o3 = new Oficinas(6,350);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(o1);
        lista.add(o2);
        lista.add(o3);
        Iterator<Edificio> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

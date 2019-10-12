package TPN9.Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Edificio> lista = new ArrayList<Edificio>();
        Edificio pd1 = new Polideportivo("San Martin",1,2.0445, 8);
        Edificio pd2 = new Polideportivo("Belgrano",2,2.4585,9);
        Edificio pd3 = new Polideportivo("Peron", 3,1.2596,15);
        Edificio of1 = new Oficinas(4,500);
        Edificio of2 = new Oficinas(2,400);
        Edificio of3 = new Oficinas(6,350);
        lista.add(pd1);
        lista.add(pd2);
        lista.add(pd3);
        lista.add(of1);
        lista.add(of2);
        lista.add(of3);
        Iterator<Edificio> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

package Progi.Parcial2ja;

public class Persona22 {
    //Atributos de la clase
    public String nombre;
    public String apellido;
    public int dni;
    public boolean yaVisito = false;


    public String obtenerNombre(){ //Funcion para devolver el nombre completo

        String nom_completo;
        nom_completo = apellido+", "+nombre;

        return nom_completo;
    }

    public void Visitante(){ //Metodo para saber si la persona ya visito el parque anteriormente.

        if (yaVisito){ //Valor booleano para saber si ya esta registrada
            System.out.println("Estado: La persona ya esta registrada como visitante");
            return;
        }
        else {
            yaVisito = true; //Si el valor es falso, entonces se vuelve verdadero y la persona queda registrada.
            System.out.println("Estado: Primera vez, la persona quedo registrada como visitante");
        }

    }

}


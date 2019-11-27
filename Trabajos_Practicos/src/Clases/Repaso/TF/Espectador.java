package Clases.Repaso.TF;

public class Espectador extends Persona {
    private String fila;
    private int silla;

    public Espectador(String nombre, int edad, String fila, int silla){
        super.setNombre(nombre);
        super.setEdad(edad);
        this.fila = fila;
        this.silla = silla;
    }

    @Override
    public String getTipo(){
        return "Espectador";
    }

    @Override
    public String toString(){
        return "Nombre: "+super.getNombre()+"\nEdad: "+super.getEdad()+"\nTipo: "+this.getTipo()+"\nButaca: "+getButaca()+
                "\n------------------------\n";
    }

    public String getButaca() {
        return fila+"-"+silla;
    }

}

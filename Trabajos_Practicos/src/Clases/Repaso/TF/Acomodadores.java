package Clases.Repaso.TF;

public class Acomodadores extends Empleado implements ParaAcomodadores{

    private Salas sala;

    public Acomodadores(String nombre, int edad){
        super(nombre,edad);
    }

    @Override
    public String getTipo(){
        return "Acomodador";
    }

    @Override
    public String toString() {
        return "Nombre: "+super.getNombre()+"\nEdad: "+super.getEdad()+"\nTipo: "+this.getTipo()+"\nSueldo: "+super.getSueldo()+
                "\n------------------------\n";
    }

    @Override
    public Salas getSala() {
        return sala;
    }

    @Override
    public void setSala(Salas sala) {
        this.sala = sala;
    }
}

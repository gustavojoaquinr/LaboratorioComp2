package Clases.Prog;

public class Auto
        implements IElemento, IBase {

    @Override
    public String nombreCompleto(){
        return "ferrari";
    }

    public int id(){
        return 100;
    }

}

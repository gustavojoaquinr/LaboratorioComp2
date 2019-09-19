package TPN7;

public class FueradeRango extends RuntimeException{
    public FueradeRango(){

    }

    public FueradeRango(String mensajeError){
        super(mensajeError);
    }
}

package TPN6;

public class CreadorContrasenas {
    private String[] arrayContrasenas;
    private int longitud;
    //caracteres para crear las contraseñas
    private String[] mayus_minus_num = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
            "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
            "0","1","2","3","4","5","6","7","8","9"};

    public CreadorContrasenas (int cantidad, int longitud) {
        this.arrayContrasenas = new String [cantidad];
        this.longitud=longitud;
    }

    public String getContrasena(int num){
        return arrayContrasenas[num];
    }

    public int getLongitud(){
        return longitud;
    }

    //Metodo que genera las contraseñas
    public void GenerarContrasenas() {
        for (int i=0; i < arrayContrasenas.length; i++) {
            arrayContrasenas[i] = "";
            for (int j=1; j <= this.longitud; j++) {
                arrayContrasenas[i] = arrayContrasenas[i] + mayus_minus_num[(int)(Math.random()*62)];
            }
        }
    }

    //Metodo que evalua si es segura o no la contraseña
    public void EvaluarContrasenas(String pass) {
        int mayus=0, minus=0, num=0;
        for (int x=0; x<longitud; x++) {
            if (pass.charAt(x) >= 'A' && pass.charAt(x) <= 'Z') {
                minus++;
            }else {
                if(pass.charAt(x) >= 'a' && pass.charAt(x) <= 'z') {
                    mayus++;
                }else {
                    num++;
                }
            }
        }

        if (num > 5 && minus> 1 && mayus > 2) {
            System.out.println("La Contraseña es SEGURA ---- mayusculas:"+mayus+"  minusculas:"+minus+" numeros:"+num);
        }else {
            System.out.println("La Contraseña es DEBIL ---- mayusculas:"+mayus+"  minusculas:"+minus+" numeros:"+num);
        }

    }

    public void Mostrar() {
        for (int i=0; i<arrayContrasenas.length; i++) {
            System.out.println("Contraseña: "+arrayContrasenas[i]);
            System.out.println("n° de caracteres: "+this.longitud);
            EvaluarContrasenas(arrayContrasenas[i]);
            System.out.println("-----------------------");
        }
    }

}


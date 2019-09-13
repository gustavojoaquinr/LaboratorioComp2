package TPN6;

public class CreadorContrasenas {
    String[] arrayContrasenas;
    public int longitud;
    //caracteres para crear las contraseñas
    String[] minus_mayus_num = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P", "Q","R","S","T","U","V","W","X","Y","Z",
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
            for(int j=1; j <= this.longitud; j++) {
                arrayContrasenas[i] = arrayContrasenas[i] + minus_mayus_num[(int)(Math.random()*61)];
            }
        }
    }

    //Metodo que evalua si es segura la contraseña
    private void EvaluarContrasena(String contrasena) {
        int mayusculas=0, minusculas=0, numeros=0;
        for (int i=0; i<longitud; i++) {
            if (contrasena.charAt(i) >= 'A' && contrasena.charAt(i) <='Z') {
                mayusculas++;
            }else if(contrasena.charAt(i) >= 'a' && contrasena.charAt(i) <='z') {
                minusculas++;
            }else {
                numeros++;
            }
        }

        if (numeros > 5 && minusculas > 1 && mayusculas > 2) {
            System.out.println("La contraseña es SEGURA ---- numeros:"+numeros+" minusculas:"+minusculas+" mayusculas:"+mayusculas);
        }else {
            System.out.println("La contraseña es DEBIL ---- numeros:"+numeros+" minusculas:"+minusculas+" mayusculas:"+mayusculas);
        }

    }

    public void MostraryEvaluar() {
        for (int i=0; i<arrayContrasenas.length; i++) {
            System.out.println("Contraseña: "+arrayContrasenas[i]);
            System.out.println("n° de caracteres: "+this.longitud);
            EvaluarContrasena(arrayContrasenas[i]);
            System.out.println("-----------------------");
        }
    }


}


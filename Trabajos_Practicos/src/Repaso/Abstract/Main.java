package Repaso.Abstract;

public class Main {
    public static void main(String[] args) {

        //SerVivo servivo = new SerVivo(); no se puede crear objetos de esta clase porque es abstracta

        Planta planta1 = new Planta();

        planta1.alimentarse();

        AnimalCarnivoro animal = new AnimalCarnivoro();

        animal.alimentarse();

    }
}

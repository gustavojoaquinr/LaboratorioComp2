package Clases.Repaso.Polimorfismo;

public class Principal {
    public static void main(String[] args) {
        Vehiculo misVehiculos [] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("Ferrari","F8","abc123");
        misVehiculos[1] = new VehiculoTurismo("Audi","A5","abb124",4);
        misVehiculos[2] = new VehiculoDeportivo("Toyota","T6","aab365",500);
        misVehiculos[3] = new VehiculoFurgoneta("Renault","Sandero", "asd562",2000);

        for(Vehiculo i: misVehiculos){
            System.out.println(i.mostrarDatos());
        }
    }
}

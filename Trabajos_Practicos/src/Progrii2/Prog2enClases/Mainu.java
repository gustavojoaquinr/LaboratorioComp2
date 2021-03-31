package Progrii2.Prog2enClases;

public class Mainu
{
    public static void main(String[] args)
    {

        Docente do1 = new Docente();

        do1.setApellido("pares");
        do1.setDni( 789);
        ImprimirLegajo(do1);

        Alumno ao1 = new Alumno();

        ao1.setApellido("gomez");
        ao1.setAñoingreso(2016);
        ao1.setDni( 458);
        ImprimirLegajo(ao1);

        NoDocente nod1 = new NoDocente();

        nod1.setApellido("garcia");
        nod1.setCargo("jefe de depto");
        nod1.setDni( 999);
        ImprimirLegajo(nod1);

        Director dir = new Director();
        dir.setDni(455);
        ImprimirLegajo(dir);

    }
    private static void ImprimirLegajo(Persona a)
    {
        System.out.println(a.getLegajo());
    }


    /*private static void ImprimirLegajo(Alumno a)
    {
        System.out.println(a.getLegajo());
    }

    private static void ImprimirLegajo(NoDocente n)
    {
        System.out.println(n.getLegajo());
    }*/
}

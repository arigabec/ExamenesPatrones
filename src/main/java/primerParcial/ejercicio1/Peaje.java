package primerParcial.ejercicio1;


public class Peaje {
    private static Peaje instance;

    private Peaje(){
        System.out.println("Iniciando el peaje ...");
    }

    public static Peaje getInstance(){
        if (instance== null)
            instance= new Peaje();
        return instance;
    }

    /*public void registrarAuto(Auto auto){

    }*/
}
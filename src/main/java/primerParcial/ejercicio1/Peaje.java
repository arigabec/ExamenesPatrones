package primerParcial.ejercicio1;

public class Peaje {
    private static Peaje instance;
    private int dinero = 0;

    private Peaje(){
        System.out.println("Iniciando el peaje ...");
        System.out.println();
    }

    public static Peaje getInstance(){
        if (instance== null)
            instance= new Peaje();
        return instance;
    }

    public void registrarAuto(Auto auto){
        System.out.println("Registrando el auto con las siguientes caracteristicas");
        auto.showInfo();
    }

    public void recibirPago(int monto){
        System.out.println("Monto recibido: " + monto);
        dinero += monto;
        System.out.println("Monto recaudado: " + dinero);
        System.out.println();
    }

    public void mostrarDinero(){
        System.out.println("Monto existente: " + dinero);
        System.out.println();
    }
}
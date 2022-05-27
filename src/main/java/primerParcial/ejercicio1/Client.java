package primerParcial.ejercicio1;

public class Client {

    public static void main(String[]args){
        Peaje peaje = Peaje.getInstance();

        Auto auto1 = new Auto();
        auto1.setPlaca("2450ASH");
        auto1.setModelo("Mazda CX5");
        auto1.setColor("Rojo");
        auto1.setPeaje(10);
        peaje.registrarAuto(auto1);
        peaje.recibirPago(auto1.getPeaje());

        Auto auto2 = new Auto();
        auto2.setPlaca("5489BNJ");
        auto2.setModelo("Suzuki Swift");
        auto2.setColor("Negro");
        auto2.setPeaje(7);
        peaje.registrarAuto(auto2);
        peaje.recibirPago(auto2.getPeaje());

        Auto auto3 = new Auto();
        auto3.setPlaca("6598ERT");
        auto3.setModelo("Nissan March");
        auto3.setColor("Azul marino");
        auto3.setPeaje(5);
        peaje.registrarAuto(auto3);
        peaje.recibirPago(auto3.getPeaje());

        Auto auto4 = new Auto();
        auto4.setPlaca("6598HBG");
        auto4.setModelo("BMW 320");
        auto4.setColor("Blanco");
        auto4.setPeaje(12);
        peaje.registrarAuto(auto4);
        peaje.recibirPago(auto4.getPeaje());

        Auto auto5 = new Auto();
        auto5.setPlaca("5231OKL");
        auto5.setModelo("Suzuki Jimny");
        auto5.setColor("Plateado");
        auto5.setPeaje(7);
        peaje.registrarAuto(auto5);
        peaje.recibirPago(auto5.getPeaje());

        Auto auto6 = new Auto();
        auto6.setPlaca("9864TYM");
        auto6.setModelo("Peugeot 2008");
        auto6.setColor("Café");
        auto6.setPeaje(10);
        peaje.registrarAuto(auto6);
        peaje.recibirPago(auto6.getPeaje());

        peaje.mostrarDinero();
    }
}
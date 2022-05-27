package primerParcial.ejercicio2;

import estructuras.prototype.structure.ConcretePrototype1;

public class Client {

    public static void main(String[] args){
        Televisor tele1 = new Televisor();
        tele1.setSistemaOperativo("Android");
        tele1.setVersionSO("11.0");
        tele1.setPulgadas(80);
        tele1.setResolucion(50);
        tele1.setPuertoHDMI(true);
        tele1.setPuertosUSB(4);
        tele1.setControlRemoto(true);
        tele1.setBluetooth(true);
        tele1.setSerial("1234567890");

        System.out.println("Fabricando televisor modelo");
        System.out.println("Sistema operativo: " + tele1.getSistemaOperativo());
        System.out.println("Version: " + tele1.getVersionSO());
        System.out.println("Pulgadas: " + tele1.getPulgadas());
        System.out.println("Resolucion: " + tele1.getResolucion());
        System.out.println("Puerto HDMI: " + tele1.getPuertoHDMI());
        System.out.println("Puertos USB: " + tele1.getPuertosUSB());
        System.out.println("Control Remoto: " + tele1.getControlRemoto());
        System.out.println("Bluetooth: " + tele1.getBluetooth());
        System.out.println("Serialn: " + tele1.getSerial());

        // Usamos el método clone para crear otro televisor
        Televisor tele2 = (Televisor) tele1.clone();
        tele2.setSerial("1234567891");

    }
}

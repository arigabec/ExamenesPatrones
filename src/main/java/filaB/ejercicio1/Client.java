package filaB.ejercicio1;

public class Client {
    public static void main(String[]args) {
        TemaTesis s1 = TemaTesis.getInstance();
        s1.registrar(new Estudiante("Camilo Rojas", "12548796"), "Finanzas");

        TemaTesis s2 = TemaTesis.getInstance();
        s2.registrar(new Estudiante("Luis Ramirez", "85642310"), "Economía");

        TemaTesis s3 = TemaTesis.getInstance();
        s3.registrar(new Estudiante("Sara Gutierrez", "41236597"), "Urbanismo");

        TemaTesis s4 = TemaTesis.getInstance();
        s4.registrar(new Estudiante("Eduardo Fernandez", "26598430"), "Finanzas");

        TemaTesis.getInstance().mostrarTesistas(new JefeRRHH("Luis García"));
    }
}
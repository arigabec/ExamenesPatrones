package primerParcial.ejercicio5;

public class Client {
    public static void main(String[] args){
        String msg = "2 * 3 + 5 + 5 + 5";
        System.out.println("Mensaje recibido: " + msg);
        Interpreter parser = new Interpreter(msg);
        System.out.println("Mensaje interpretado: " + parser.evaluateMsg());
    }
}

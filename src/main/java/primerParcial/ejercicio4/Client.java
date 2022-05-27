package primerParcial.ejercicio4;

public class Client {
    public static void main(String[] args){
        Vendedor vendedor = new Vendedor();

        // Entra un cliente y pide 1 de cada paquete
        MegaPaquete mp = new MegaPaquete();
        PaqueteMediano pm = new PaqueteMediano();
        PaqueteNormal pn = new PaqueteNormal();

        vendedor.setBuilder(mp);
        vendedor.buildProduct();
        Combo combo1 = vendedor.getProductBuilder();
        combo1.showInfo();

        vendedor.setBuilder(pm);
        vendedor.buildProduct();
        Combo combo2 = vendedor.getProductBuilder();
        combo2.showInfo();

        vendedor.setBuilder(pn);
        vendedor.buildProduct();
        Combo combo3 = vendedor.getProductBuilder();
        combo3.showInfo();
    }
}

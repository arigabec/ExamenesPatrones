package filaB.ejercicio3;

public class CreatorCamiseta extends Creator {
    @Override
    public Camiseta factoryMethodProduct() {
        Camiseta camiseta = new Camiseta();
        camiseta.setSize("S");
        camiseta.setColor("Verde con blanco");
        return camiseta;
    }
}

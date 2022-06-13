package filaB.ejercicio3;

public class CreatorMedias extends Creator {
    @Override
    public Medias factoryMethodProduct() {
        Medias medias = new Medias();
        medias.setSize("36-38");
        medias.setColor("Blancas");
        return medias;
    }
}

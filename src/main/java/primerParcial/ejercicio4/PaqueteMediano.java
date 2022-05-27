package primerParcial.ejercicio4;

public class PaqueteMediano extends Builder {
    @Override
    public void buildPipocas() {
        combo.setSizePipocas("Pipocas grandes");
    }

    @Override
    public void buildGaseosa() {
        combo.setSizeGaseosa("2 vasos de refresco");
    }

    @Override
    public void buildChocolate() {
        combo.setChocolates("1 chocolate");

    }
}

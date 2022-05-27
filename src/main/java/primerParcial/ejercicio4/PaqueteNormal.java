package primerParcial.ejercicio4;

public class PaqueteNormal extends Builder {
    @Override
    public void buildPipocas() {
        combo.setSizePipocas("Pipocas en envase normal");
    }

    @Override
    public void buildGaseosa() {
        combo.setSizeGaseosa("1 vaso de refresco");
    }

    @Override
    public void buildChocolate() {
        combo.setChocolates("No cuenta con chocolates");

    }
}

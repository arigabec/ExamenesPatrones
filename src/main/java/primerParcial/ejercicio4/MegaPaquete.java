package primerParcial.ejercicio4;

public class MegaPaquete extends Builder {
    @Override
    public void buildPipocas() {
        combo.setSizePipocas("Pipocas extragrandes");
    }

    @Override
    public void buildGaseosa() {
        combo.setSizeGaseosa("3 vasos extragrandes con recarga ilimitada");
    }

    @Override
    public void buildChocolate() {
        combo.setChocolates("2 chocolates grandes");

    }
}

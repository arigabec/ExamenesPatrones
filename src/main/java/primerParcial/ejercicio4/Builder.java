package primerParcial.ejercicio4;

public abstract class Builder {
    protected Combo combo;

    public Combo getProduct() {
        return combo;
    }

    public void createProduct() {
        this.combo = new Combo();
    }

    public abstract void buildPipocas();
    public abstract void buildGaseosa();
    public abstract void buildChocolate();
}

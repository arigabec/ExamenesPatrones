package primerParcial.ejercicio4;

public class Vendedor {
    private Builder builder;

    public Combo getProductBuilder(){
        return builder.getProduct();
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createProduct();
        this.builder.buildPipocas();
        this.builder.buildGaseosa();
        this.builder.buildChocolate();
    }
}

package primerParcial.ejercicio4;

public class Combo {
    private String sizePipocas;
    private String sizeGaseosa;
    private String chocolates;

    public Combo(){}

    public String getSizePipocas() {
        return sizePipocas;
    }

    public void setSizePipocas(String sizePipocas) {
        this.sizePipocas = sizePipocas;
    }

    public String getSizeGaseosa() {
        return sizeGaseosa;
    }

    public void setSizeGaseosa(String sizeGaseosa) {
        this.sizeGaseosa = sizeGaseosa;
    }

    public String getChocolates() {
        return chocolates;
    }

    public void setChocolates(String chocolates) {
        this.chocolates = chocolates;
    }

    public void showInfo() {
        System.out.println("Creando Combo");
        System.out.println("Tamaño de las pipocas: " + sizePipocas);
        System.out.println("Tamaño de la gaseosa: " + sizeGaseosa);
        System.out.println("Chocolates: " + chocolates);
        System.out.println();
    }
}

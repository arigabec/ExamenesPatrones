package primerParcial.ejercicio2;

import estructuras.prototype.structure.IPrototype;

public class Televisor implements ITelevisor {
    private String sistemaOperativo;
    private String versionSO;
    private int pulgadas;
    private int resolucion;
    private Boolean puertoHDMI;
    private int puertosUSB;
    private Boolean controlRemoto;
    private Boolean bluetooth;
    private String serial;

    public Televisor(){}

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersionSO() {
        return versionSO;
    }

    public void setVersionSO(String versionSO) {
        this.versionSO = versionSO;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(Boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    public Boolean getControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(Boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public Object clone(){
        Televisor clone = new Televisor();
        clone.setSistemaOperativo(this.getSistemaOperativo());
        clone.setVersionSO(this.getVersionSO());
        clone.setPulgadas(this.getPulgadas());
        clone.setResolucion(this.getResolucion());
        clone.setPuertoHDMI(this.getPuertoHDMI());
        clone.setPuertosUSB(this.getPuertosUSB());
        clone.setControlRemoto(this.getControlRemoto());
        clone.setBluetooth(this.getBluetooth());
        clone.setSerial(this.getSerial());
        return clone;
    }
}

package com.celulares;

public class SmartPhone extends SmartDevice{

    private boolean estuche;
    private boolean audifonos;

    public SmartPhone(int serie, String color, String modelo, float presion, float memoriaRam, float memoriaAlm) {
        super(serie, color, modelo, presion, memoriaRam, memoriaAlm);
    }

    public SmartPhone() {
    }
}

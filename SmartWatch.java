package com.celulares;

public class SmartWatch extends SmartDevice{

    private String colorM;
    private boolean android;

    public SmartWatch(int serie, String color, String modelo, float presion, float memoriaRam, float memoriaAlm, String colorM, boolean android) {
        super(serie, color, modelo, presion, memoriaRam, memoriaAlm);
        this.colorM = colorM;
        this.android = android;
    }

    public SmartWatch(int serie, String color, String modelo, float presion, float memoriaRam, float memoriaAlm) {
        super(serie, color, modelo, presion, memoriaRam, memoriaAlm);
    }

    public SmartWatch() {
    }
}

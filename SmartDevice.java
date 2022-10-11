package com.celulares;

public class SmartDevice {

    private int serie;
    private String color;
    private String modelo;
    private float presion;
    private float memoriaRam;
    private float memoriaAlm;

    public SmartDevice(int serie, String color, String modelo, float presion, float memoriaRam, float memoriaAlm) {
        this.serie = serie;
        this.color = color;
        this.modelo = modelo;
        this.presion = presion;
        this.memoriaRam = memoriaRam;
        this.memoriaAlm = memoriaAlm;
    }

    public SmartDevice() {
        super();
    }

}
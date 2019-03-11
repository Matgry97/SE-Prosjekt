package com.company;

public class billett {

    private String filmnavn;
    private String kinonavn;
    private int salnr;
    private String sitteplass;
    private int radnr;
    private int setenr;
    private double billettpris;
    private double klokkeslett;
    private int dato;

    public billett(String filmnavn, String kinonavn, int salnr, String sitteplass, int radnr, int setenr, double billettpris, double klokkeslett, int dato) {
        this.filmnavn = filmnavn;
        this.kinonavn = kinonavn;
        this.salnr = salnr;
        this.sitteplass = sitteplass;
        this.radnr = radnr;
        this.setenr = setenr;
        this.billettpris = billettpris;
        this.klokkeslett = klokkeslett;
        this.dato = dato;
    }

    public String getFilmnavn() {
        return filmnavn;
    }

    public void setFilmnavn(String filmnavn) {
        this.filmnavn = filmnavn;
    }

    public String getKinonavn() {
        return kinonavn;
    }

    public void setKinonavn(String kinonavn) {
        this.kinonavn = kinonavn;
    }

    public int getSalnr() {
        return salnr;
    }

    public void setSalnr(int salnr) {
        this.salnr = salnr;
    }

    public String getSitteplass() {
        return sitteplass;
    }

    public void setSitteplass(String sitteplass) {
        this.sitteplass = sitteplass;
    }

    public int getRadnr() {
        return radnr;
    }

    public void setRadnr(int radnr) {
        this.radnr = radnr;
    }

    public int getSetenr() {
        return setenr;
    }

    public void setSetenr(int setenr) {
        this.setenr = setenr;
    }

    public double getBillettpris() {
        return billettpris;
    }

    public void setBillettpris(double billettpris) {
        this.billettpris = billettpris;
    }

    public double getKlokkeslett() {
        return klokkeslett;
    }

    public void setKlokkeslett(double klokkeslett) {
        this.klokkeslett = klokkeslett;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}

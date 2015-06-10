package com.afif.project;

/**
 * Created by PAVILION on 6/10/2015.
 */
public class HP {
    private String merkHp;
    private int tipeHp;
    private int tahunPembuatan;
    private String dibuatOleh;
    private kartuPerdana menggunakan;

    public HP(String merkHp, int tipeHp) {
        this.merkHp = merkHp;
        this.tipeHp = tipeHp;
    }

    public HP(String merkHp, int tipeHp, int tahunPembuatan, String dibuatOleh, kartuPerdana menggunakan) {
        this.merkHp = merkHp;
        this.tipeHp = tipeHp;
        this.tahunPembuatan = tahunPembuatan;
        this.dibuatOleh = dibuatOleh;
        this.menggunakan = menggunakan;
    }

    public String getMerkHp() {
        return merkHp;
    }

    public void setMerkHp(String merkHp) {
        this.merkHp = merkHp;
    }

    public int getTipeHp() {
        return tipeHp;
    }

    public void setTipeHp(int tipeHp) {
        this.tipeHp = tipeHp;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public String getDibuatOleh() {
        return dibuatOleh;
    }

    public void setDibuatOleh(String dibuatOleh) {
        this.dibuatOleh = dibuatOleh;
    }

    public kartuPerdana getMenggunakan() {
        return menggunakan;
    }

    public void setMenggunakan(kartuPerdana menggunakan) {
        this.menggunakan = menggunakan;
    }

    @Override
    public String toString() {
        return "HP{" +
                "merkHp='" + merkHp + '\'' +
                ", tipeHp=" + tipeHp +
                ", tahunPembuatan=" + tahunPembuatan +
                ", dibuatOleh='" + dibuatOleh + '\'' +
                ", menggunakan=" + menggunakan +
                '}';
    }
}

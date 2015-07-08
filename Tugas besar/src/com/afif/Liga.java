package com.afif;

import java.util.ArrayList;

/**
 * Created by PAVILION on 7/7/2015.
 */
public class Liga {
    private String namaLiga;
    private Divisi divisi;
    private Klub daftarKlub;

    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();
    ArrayList<Divisi> namaDivisi = new ArrayList<Divisi>();

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public Liga(String namaLiga, Klub daftarKlub, Divisi divisi) {
        this.namaLiga = namaLiga;
        this.daftarKlub = daftarKlub;
        this.divisi = divisi;
    }

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public Klub getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub(Klub daftarKlub) {
        this.daftarKlub = daftarKlub;
    }

    public Divisi getDivisi() {
        return divisi;
    }

    public void setDivisi(Divisi divisi) {
        this.divisi = divisi;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        return daftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi) {
        this.daftarDivisi.add(divisi);
    }

    public ArrayList<Divisi> getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(Divisi divisi) {
        this.namaDivisi.add(divisi);
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                '}';
    }
}

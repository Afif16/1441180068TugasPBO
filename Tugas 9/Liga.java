package com.afif;

import java.util.ArrayList;

/**
 * Created by PAVILION on 6/24/2015.
 */
public class Liga {
    private String namaLiga;
    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();

    public Liga(String namaLiga){
        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        return daftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi) {
        this.daftarDivisi.add(divisi);
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                ", daftarDivisi=" + daftarDivisi +
                '}';
    }
}


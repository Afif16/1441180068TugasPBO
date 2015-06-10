package com.afif.project;

/**
 * Created by PAVILION on 6/10/2015.
 */
public class kartuPerdana {
    private String namaKartu;
    private int nomerKartu;
    private Double sisaPulsa;
    private String infoPaket;

    public kartuPerdana(String namaKartu, int nomerKartu) {
        this.namaKartu = namaKartu;
        this.nomerKartu = nomerKartu;
    }

    public kartuPerdana(String namaKartu, int nomerKartu, Double sisaPulsa, String infoPaket) {
        this.namaKartu = namaKartu;
        this.nomerKartu = nomerKartu;
        this.sisaPulsa = sisaPulsa;
        this.infoPaket = infoPaket;
    }

    public String getNamaKartu() {
        return namaKartu;
    }

    public void setNamaKartu(String namaKartu) {
        this.namaKartu = namaKartu;
    }

    public int getNomerKartu() {
        return nomerKartu;
    }

    public void setNomerKartu(int nomerKartu) {
        this.nomerKartu = nomerKartu;
    }

    public Double getSisaPulsa() {
        return sisaPulsa;
    }

    public void setSisaPulsa(Double sisaPulsa) {
        this.sisaPulsa = sisaPulsa;
    }

    public String getInfoPaket() {
        return infoPaket;
    }

    public void setInfoPaket(String infoPaket) {
        this.infoPaket = infoPaket;
    }

    @Override
    public String toString() {
        return "kartuPerdana{" +
                "namaKartu='" + namaKartu + '\'' +
                ", nomerKartu=" + nomerKartu +
                ", sisaPulsa=" + sisaPulsa +
                ", infoPaket='" + infoPaket + '\'' +
                '}';
    }
}

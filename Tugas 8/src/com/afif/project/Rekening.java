package com.afif.project;

/**
 * Created by PAVILION on 6/17/2015.
 */
public class Rekening {
    private double saldo;
    private double hasil;

    public Rekening(double saldo) {
        this.saldo = saldo;
    }

    public void tarik(double tarik){
        this.saldo = saldo - tarik;
    }

    public void setor(double setor){
       this.saldo = saldo + setor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Rekening{" +
                "saldo=" + saldo +
                '}';
    }
}

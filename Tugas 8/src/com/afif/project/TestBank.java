package com.afif.project;

/**
 * Created by PAVILION on 6/17/2015.
 */
public class TestBank {
    public static void main(String[] args) {
        Rekening rek = new Rekening(20000000.0);
        Nasabah nsb = new Nasabah("Rezha",rek);
        System.out.println(nsb.toString());

//        Tarik uang sebesar 10 Juta

        rek.tarik(10000000.0);
        System.out.println("Mengambil uang sebesar Rp. 10.000.000");


//        Tampilkan sisa saldo

        System.out.println("Sisa saldo Anda sebesar = " + rek.getSaldo());

//        Setor saldo 5 Juta

        rek.setor(5000000.0);
        System.out.println("Anda menyetor uang sebesar Rp. 5.000.000");

//          Tampilka sisa saldo

        System.out.println("Sisa saldo Anda sebesar = " + rek.getSaldo());
    }
}
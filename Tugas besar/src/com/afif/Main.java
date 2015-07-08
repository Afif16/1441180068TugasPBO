package com.afif;

public class Main {

        public static void main(String[] args) {
//      Membuat Objek
            Liga inggrisA = new Liga("Inggris A");
            Liga inggrisB  = new Liga("Inggris B");

            Divisi primera = new Divisi("Primer League A");
            Divisi primerb = new Divisi("Primer League B");

            Klub mancesterUnited = new Klub("Mancester United",primera,inggrisA);
            Klub arsenal = new Klub("Arsenal",primera,inggrisA);

            Klub mancesterCity = new Klub("Mancester City",primerb,inggrisB);
            Klub celsea = new Klub("Celsea",primerb,inggrisB);

//       kelas.set apa yang kamu ambil
            inggrisA.setDaftarDivisi(primera);
            inggrisB.setDaftarDivisi(primerb);

            primera.setDaftarKlub(mancesterUnited);
            primera.setDaftarKlub(arsenal);

            primerb.setDaftarKlub(mancesterCity);
            primerb.setDaftarKlub(celsea);

//        No 1(Get daftar Divisi by nama Liga)
            System.out.println("Soal No.1");

            System.out.println(inggrisA.getDaftarDivisi());
            System.out.println(inggrisB.getDaftarDivisi());
            System.out.println("");

//        No 2(Get daftar Klub by nama Liga)
            System.out.println("Soal No.2");

            inggrisA.setDaftarKlub(mancesterUnited);
            inggrisB.setDaftarKlub(mancesterCity);

            System.out.println(inggrisA.getDaftarKlub());
            System.out.println(inggrisB.getDaftarKlub());
            System.out.println("");

//        No 3(Get daftar Klub by nama Divisi)
            System.out.println("Soal No.3");
            System.out.println(primera.getDaftarKlub());
            System.out.println(primerb.getDaftarKlub());
            System.out.println("");

//        No 4(Get Klub ini berada di Divisi mana by nama Klub)
            System.out.println("Soal No.4");

            mancesterCity.setDivisi(primerb);
            System.out.println(mancesterCity.getNamaKlub());
            System.out.println(mancesterCity.getDivisi());
            System.out.println("");

//        No 5(Get Klub ini berada di Liga apa by nama Klub)
            System.out.println("Soal No.5");

            arsenal.setLiga(inggrisA);
            System.out.println(arsenal.getNamaKlub());
            System.out.println(arsenal.getLiga());

        }
    }

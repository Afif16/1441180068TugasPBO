package com.afif.project;

/**
 * Created by PAVILION on 6/10/2015.
 */
public class TestUjicoba {

    public static void main(String[] args) {

        kartuPerdana rezha = new kartuPerdana("Loop loop",12345,10000.0,"Hotrod");

        HP pertama = new HP("Nokia",1202,1997,"Tome delonge",rezha);


        System.out.println(pertama.toString());

    }
}

package com.afif;

import com.sun.prism.shader.AlphaOne_LinearGradient_AlphaTest_Loader;

public class Main {

    public static void main(String[] args) {
	// write your code here


            Liga italy = new Liga("Italy");
            Divisi serieA = new Divisi("Serie A");
            Divisi serieB = new Divisi("Serie B");

            italy.setDaftarDivisi(serieA);
            italy.setDaftarDivisi(serieB);

            System.out.println(italy.toString());


    }
}

package com.univ;

public class main {
    public static void main(String[] args) {

        // Objek kedua: David
        mahasiswa jri = new mahasiswa(
                "4524210112",
                "fajri",
                "ganteng",
                "10 Mei 2007",
                "Jl. dago No.8",
                "informatika",
                19
        );

        // Tampilkan info
 
        jri.displayInfo();

        // Panggil method belajar dan ujian
        jri.ujian();
    }
}
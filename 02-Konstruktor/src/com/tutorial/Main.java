package com.tutorial;

//class tanpa konstruktor
class Polos {
    String dataString;
    int dataInteger;
}

//class dengan konstruktor
class Mahasiswa {
    String Nama;
    String Nim;
    String Prodi;

    // //Membuat Konstruktor tanpa paramter
    // Mahasiswa (){
    //      System.out.println("Ini adalah konstruktor");
    // }

    //Membuat Konstruktor dengan paramter
    Mahasiswa (String inputNama, String inputNim, String inputProdi) {
        Nama = inputNama;
        Nim = inputNim;
        Prodi = inputProdi;

        System.out.println("Nama :" + Nama);
        System.out.println("NIM :" + Nim);
        System.out.println("Prodi : " + Prodi);
        
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Program JAVA Pertama Saya");

        // //instansiasi objek dari class Polos
        // Polos pls = new Polos ();

        // //isi ciri pada objek pls
        // pls.dataString = "POLOS";
        // pls.dataInteger = 10;

        // //cetak data
        // System.out.println("Isi data String" + pls.dataString);
        // System.out.println("Isi data Integer" + pls.dataInteger);

        Mahasiswa mhs1 = new Mahasiswa("rizal", "22242028", "PTI");

        // memanggil konstruktor
       
    }
}

package com.tutorial;

class Mahasiswa{
    //Data Member
    String nama;
    String prodi;
    String nim;

    //Construktor dengan parameter
    Mahasiswa(String Nama, String Prodi, String Nim){
        this.nama = Nama;
        this.prodi = Prodi;
        this.nim = Nim;
    }

    //method tanpa parameter dan tanpa return
    void show(){
        System.out.println("Nama :" + this.nama);
        System.out.println("Prodi : " + this.prodi);
        System.out.println("Nim : " + this.nim);
    }

    //method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    //method daengan return tanpa parameter
    String getNama(){
        return this.nama;
    }

    //method dengan return dan parameter
    String sayHi (String pesan){
        return pesan + "Saya adalah " + this.nama;
    }
}


public class Main {
    public static void main(String[] args) {
        //instansiasi objek
        Mahasiswa mhs1 = new Mahasiswa("rijal", "PTI", "22241028");

        mhs1.show();
        mhs1.setNama("asgard");
        mhs1.show();
        System.out.println(mhs1.getNama());
        
        String pesan = mhs1.sayHi("Hello ");
        System.out.println(pesan);
    }
}

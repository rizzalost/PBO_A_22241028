package com.tutorial;

class Pegawai {
    public String nama;
    public String jabatan;
    public float pajak;
    public float gajiPokok;
    private float gajiBersih;

    Pegawai(String nama, String jabatan, float pajak, float gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak;
        this.gajiPokok = gajiPokok;
    }

    public float getPajak(float pajak) {
        return this.pajak = pajak/100;
    }

    public void setGajiBersih(float gajiBersih) {
        this.gajiBersih = gajiBersih;
    }

    public float getGajiBersih() {
        return gajiBersih;
    }

    public void hitungGajiBersih() {
        gajiBersih = gajiPokok - (gajiPokok * pajak);
    }
}

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Adam", "Dosen", 0.1f, 3500000);

        pegawai.hitungGajiBersih();

        System.out.println("Nama Karyawan: " + pegawai.nama);
        System.out.println("Jabatan: " + pegawai.jabatan);
        System.out.println("Gaji Bersih: " + pegawai.getGajiBersih());
    }
}

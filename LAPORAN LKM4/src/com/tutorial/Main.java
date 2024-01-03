package com.tutorial;

//Class utama Bangun datar
class BangunDatar{
    float luas;
    float keliling;

    public float getLuas(){
        return luas;
    }
    public void setLuas(float luas){
        this.luas = luas;
    }
    public float getKeliling(){
        return keliling;
    }
    public void setKeliling(float keliling){
        this.keliling = keliling;
    }
    public void display(){
        // System.out.println("Luas : " + luas);
        // System.out.println("Keliling : " + keliling);
        System.out.println("Luas : " + this.getLuas());
        System.out.println("Kelliling : " + this.getKeliling());
    }
}

//Class Persegi merupakan turunan dari BangunDatar
class Persegi extends BangunDatar{
     float sisi;

    public Persegi(float sisi){
        this.sisi = sisi;
    }
    
    public float getLuas(){
        return sisi * sisi;
   }
   
   public float getKeliling(){
    return 4 * sisi;
  }
}

//Class lingkaran merupakan turunan dari BangunDatar
class Lingkaran extends BangunDatar{
    float r;
    float diameter;

    public Lingkaran (float r, float diameter){
        this.r = r;
        this.diameter = diameter;
    }

    public float getLuas(){
        return (float) Math.PI * r * r;
    }

    public float getKeliling(){
        return (float) Math.PI * 2 * r;
    }   
}
//Class Persegi Panjang merupakan turunan dari BangunDatar
class PersegiPanjang extends BangunDatar{
    float panjang;
    float lebar;

    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public float getLuas(){
        return panjang * lebar;
    }
    public float getKeliling(){
        return 2 * (panjang * lebar);
    }
}
//CLass Segitiga merupakan turunan dari BangunDatar
class Segitiga extends BangunDatar{
    float alas;
    float tinggi;

    public Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public float getLuas(){
        return 0.5f * alas * tinggi;
    }
    public float getKeliling(){
        return alas + tinggi + alas * (3);
    }
       
 
}
//Class main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        //Persegi
        Persegi persegi = new Persegi(8);
        persegi.display();
        //Lingkaran
        Lingkaran lingkaran = new Lingkaran(15, 30);   
        lingkaran.display();
        //Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(8, 28);
        persegiPanjang.display();
        //Segitiga
        Segitiga segitiga = new Segitiga(15, 9);
        segitiga.display();       
    } 
}
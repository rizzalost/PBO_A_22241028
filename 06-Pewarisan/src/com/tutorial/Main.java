package com.tutorial;

class Hero {
    //att
    String nama;
    Float exp;
    Float health;
}
    
    //subsclass
    class HeroMage extends Hero{

}


public class Main {
    public static void main(String[] args) {
        //intansiasi objek
        Hero hero_1 = new HeroMage();
        hero_1.nama = "lunox";

        System.out.println(hero_1.nama);

        HeroMage hero_2 = new HeroMage();
        hero_2.nama = "joy";

        System.out.println(hero_2.nama);
    }
}

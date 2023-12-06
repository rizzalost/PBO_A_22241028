package com.tutorial;


class Player {
    //Data member
    String name;// default, bisa dibaca dan ditulis diluar class
    public int exp;// public, bisa dibaca dan ditulis diluar class
    private int health;// private, hanya bisa dibaca oleh class itu sendiri

    //konstruktor
    Player (String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    void display() {
        System.out.println("Hero 1 : " + this.name);
        System.out.println("Hero Health : " + this.health);
        System.out.println("Hero EXP : " + this.exp);
    }
}

public class Main {
    public static void main(String[] args) {
        // membuat objek atau instantiasi objek
        Player hero_1 = new Player("fredrin", 200, 500);

        // default
        System.out.println(hero_1.name);
        hero_1.name = "sambo";
        System.out.println(hero_1.name);

        // public
        System.out.println(hero_1.exp);
        hero_1.exp = 100;
        System.out.println(hero_1.exp);

        // private
        hero_1.display();
    }
}

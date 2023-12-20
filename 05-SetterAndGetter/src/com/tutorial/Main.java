package com.tutorial;

class User {
    private String username;
    private String password;

    //membuat konstruktor
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //method getter
    public String getUsername() {
        return this.username;
    }

    public String GetPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


public class Main {
    public static void main(String[] args) {
        //instantsiasi objek
        User person_1 = new User("asgard", "bismillah");

        //panggil method getter
        System.out.println(person_1.getUsername());
        System.out.println(person_1.GetPassword());

        person_1.setPassword("masyaAllah");
        System.out.println("new Password: " + person_1.GetPassword());
    }
}

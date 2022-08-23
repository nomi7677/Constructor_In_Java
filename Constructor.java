package com.firstpackage;


class Alien{
    private int age;
    private String name;

    Alien(){
        age=25;
        name="Albert";

    }

    Alien(int age, String name){
        this.age=age;
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}

public class Constructor {
    public static void main(String[] args) {
        Alien a = new Alien(10, "Alexa");

        System.out.println(a.getAge());
        System.out.println(a.getName());

        Alien a2 = new Alien();
        System.out.println(a2.getAge());
        System.out.println(a2.getName());
    }
}

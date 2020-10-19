package com.hieutt.aaa;

public class Cat extends Animal {

    public int age;
    public String name;

    public Cat() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keu() {
        System.out.println("cat...");
    }
}

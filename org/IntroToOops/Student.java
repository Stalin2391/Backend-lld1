package org.IntroToOops;

public class Student {
    private String name;
    int age;
    protected double psp;
    public String batch;

    // Constructor is a special function
//        1. Name same as Class name no return type
//          2. initialise data members

//    public Student() {
//        name = "Stalin";
//        age = 33;
//        psp = 98.00;
//        batch = "xyz";
//    }

    void print() {
        System.out.println("Name is " +  name);
    }

    // This - This keyword nothing but it's referring the current Object Address
    void setName(String name) {
        this.name = name;
        this.getName();
    }

    String getName() {
        return name;
    }

}

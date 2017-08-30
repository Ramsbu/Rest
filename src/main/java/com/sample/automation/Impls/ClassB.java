package com.sample.automation.Impls;

public class ClassB extends ClassA {

    void test1(){
        System.out.println("Ramesh");
    }

    public static void main(String[] args) {
        ClassA classB=new ClassB();
        classB.test1();
    }
}

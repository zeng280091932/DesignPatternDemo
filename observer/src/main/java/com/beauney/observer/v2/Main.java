package com.beauney.observer.v2;

/**
 * @author zengjiantao
 * @since 2020-07-30
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()){
            System.out.println("wait for child cry.......");
        }
        System.out.println("Child is crying.......");
    }
}

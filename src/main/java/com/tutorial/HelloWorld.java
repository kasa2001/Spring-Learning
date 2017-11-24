package com.tutorial;

public class HelloWorld {

    protected String message1;
    protected String message2;

    public HelloWorld() {
        System.out.println("Konstruktor bez paramentrów");
    }

    public HelloWorld(String data) {
        System.out.println("Konstruktor z danymi: " + data);
    }

    public void getMessage1() {
        System.out.println("1. " + message1);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void getMessage2() {
        System.out.println("2. " + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void destroy() {
        System.out.println("Goodbye child");
    }


}

package com.company;

public class Bed {
    private int length;
    private int width;
    private boolean isSleeping;

    public Bed(int length, int width, boolean isSleeping) {
        this.length = length;
        this.width = width;
        this.isSleeping = isSleeping;
    }

    public void isSleeping() {
        if (this.isSleeping) {
            System.out.println("Hello, someone is sleeping here.");
        } else {
            System.out.println("It is a pity. Nobody is here.");
        }
    }
}

package com.company;

public class Chair {
    private int width;
    private int height;
    private int length;
    private String type;

    public Chair(int width, int height, int length, String type) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.type = type;
    }

    public void sitOnAChair() {
        System.out.println("I sat on a chair");
    }
}

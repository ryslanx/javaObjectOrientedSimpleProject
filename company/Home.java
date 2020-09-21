package com.company;

public class Home {
    private Laptop laptop;
    private Chair chair;
    private Bed bed;

    public Home(Laptop laptop, Chair chair, Bed bed) {
        this.laptop = laptop;
        this.chair = chair;
        this.bed = bed;
    }

    public void startPlayingComputerGames() {
        laptop.playComputerGames();
    }

    private Laptop getLaptop() {
        return laptop;
    }

    public Chair getChair() {
        return chair;
    }

    public Bed getBed() {
        return bed;
    }
}

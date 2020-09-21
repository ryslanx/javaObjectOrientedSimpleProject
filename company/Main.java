package com.company;

public class Main {

    public static void main(String[] args) {
	    Laptop laptop = new Laptop("white", 50, 50);
	    Chair chair = new Chair(30, 50 , 40, "new Chair");
	    Bed bed = new Bed(200, 150, true);

	    Home home = new Home(laptop, chair, bed);
	    home.getBed().isSleeping();
	    home.startPlayingComputerGames();
    }
}

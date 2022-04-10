package com.revature.SimpleSpringExample.Domain;

public class Laptop {

    private int laptopID;
    private String laptopName;

    public int getLaptopID() {
        return laptopID;
    }

    public void setLaptopID(int laptopID) {
        this.laptopID = laptopID;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public void compile(){
        System.out.println("Compiling!");
    }

}

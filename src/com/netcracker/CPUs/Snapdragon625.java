package com.netcracker.CPUs;


public class Snapdragon625 implements ICPU {

    public void calculate() {
        System.out.println("Snapdragon625.calculate");
    }

    public void showBlueScreenOfDeath() {
        System.out.println("Snapdragon625.showBlueScreenOfDeath");
    }

    @Override
    public String toString() {
        return "Snapdragon625";
    }
}

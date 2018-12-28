package com.netcracker.CPUs;

public class i9 implements ICPU {

    public void calculate() {
        System.out.println("i9.calculate");
    }

    public void showBlueScreenOfDeath() {
        System.out.println("i9.showBlueScreenOfDeath");
    }
    @Override
    public String toString(){
        return "i9 cpu";
    }
}

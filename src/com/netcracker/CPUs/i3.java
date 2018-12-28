package com.netcracker.CPUs;

public class i3 implements ICPU{
    public void calculate() {
        System.out.println("i3.calculate");
    }

    public void showBlueScreenOfDeath() {
        System.out.println("i3.showBlueScreenOfDeath");
    }

    @Override
    public String toString(){
        return "i3 cpu";
    }
}

package com.netcracker.devices;

import com.netcracker.CPUs.ICPU;

public class Computer{
    private ICPU cpu;
    private int memoryGB;

    public Computer(ICPU cpu, int memoryGB) {
        System.out.println("cpu = [" + cpu + "], memoryGB = [" + memoryGB + "]");
        this.cpu = cpu;
        this.memoryGB = memoryGB;
    }

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer " + "cpu=" + cpu +
                ", memoryGB=" + memoryGB;
    }

    public ICPU getCpu() {
        System.out.println("Computer.getCpu");
        return cpu;
    }

    public void setCpu(ICPU cpu) {
        System.out.println("Computer.setCpu = [" + cpu + "]");
        this.cpu = cpu;
    }

    public int getMemoryGB() {
        System.out.println("Computer.getMemoryGB");
        return memoryGB;
    }

    public void setMemoryGB(int memoryGB) {
        System.out.println("Computer.setMemoryGB = [" + memoryGB + "]");
        this.memoryGB = memoryGB;
    }
}

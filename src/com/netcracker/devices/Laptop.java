package com.netcracker.devices;

import com.netcracker.CPUs.ICPU;

public class Laptop extends Computer {
    public Laptop(ICPU cpu, int memoryGB) {
        super(cpu, memoryGB);
    }

    @Override
    public String toString() {
        return "Laptop{" + "cpu=" + getCpu() + ", memoryGB=" + getMemoryGB() + '}';
    }
}

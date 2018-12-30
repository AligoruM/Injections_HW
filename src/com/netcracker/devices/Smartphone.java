package com.netcracker.devices;

import com.netcracker.CPUs.ICPU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Smartphone {
    private ICPU cpu;
    private int memoryGB = 3;

    @Autowired
    public Smartphone(ICPU cpu) {
        this.cpu = cpu;
    }

    /*@Autowired
    @Qualifier("mobileCPU")
    public void setCpu(ICPU cpu) {
        this.cpu = cpu;
    }*/

    @Override
    public String toString() {
        return "Smartphone " + "cpu = " + cpu +
                ", memoryGB = " + memoryGB;
    }
}

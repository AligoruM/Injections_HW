package com.netcracker.conf;

import com.netcracker.CPUs.ICPU;
import com.netcracker.CPUs.i9;

public class ConfigClass {
    static private ICPU cpu = new i9();
    static private int memoryGB = 1024;

    public static ICPU getCpu() {
        return cpu;
    }

    public static int getMemoryGB() {
        return memoryGB;
    }
}

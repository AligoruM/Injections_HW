package com.netcracker;

import com.netcracker.CPUs.i3;
import com.netcracker.CPUs.i9;

public class Factory {
    public Factory() {
        System.out.println("Factory.Factory");
    }

    public i3 getI3(){
        System.out.println("Factory.getI3");
        return new i3();
    }
    public static i9 getI9(){
        System.out.println("Factory.getI9");
        return new i9();
    }
}

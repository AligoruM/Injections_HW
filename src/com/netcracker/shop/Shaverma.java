package com.netcracker.shop;

public class Shaverma {
    private boolean isVeg;
    private static int count;

    public Shaverma() {
        count++;
    }

    @Override
    public String toString() {
        return "A new " + (isVeg? "veggie ":"") + "shaverma, count(" + count + ')';
    }

    public void setIsVeg(boolean veg) {
        isVeg = veg;
    }
}

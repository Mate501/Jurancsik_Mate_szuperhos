package com.szuperhos;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{
    private Random random = new Random();

    public Vasember() {
        super(150.0, true);
    }

    @Override
    boolean megmentiAVilagot() {
        return getSzuperEro() > 1000;
    }

    @Override
    public void kutyutKeszit() {
        setSzuperEro(getSzuperEro() + random.nextDouble() * 10);
    }

    @Override
    public String toString() {
        return "Vasember{" +
                super.toString()
                +
                "}";
    }
}

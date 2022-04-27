package com.szuperhos;

public class Batman implements Szuperhos, Milliardos{
    private double lelemenyesseg;

    public Batman() {
        lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return szuperhos.mekkoraAzEreje() < lelemenyesseg;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }

    @Override
    public String toString() {
        return "Batman{" +
                "lelemenyesseg=" + lelemenyesseg +
                '}';
    }
}

package com.szuperhos;

public abstract class Bosszuallo implements Szuperhos{
    private double szuperEro;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperEro, boolean vanEGyengesege) {
        this.szuperEro = szuperEro;
        this.vanEGyengesege = vanEGyengesege;
    }

    abstract boolean megmentiAVilagot();

    @Override
    public double mekkoraAzEreje() {
        return szuperEro;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo){
            Bosszuallo ellenfel = ((Bosszuallo) szuperhos);
            return ellenfel.vanEGyengesege && ellenfel.szuperEro < szuperEro;
        }else {
            //Batman
            return szuperEro > szuperhos.mekkoraAzEreje() * 2;
        }
    }

    public double getSzuperEro() {
        return szuperEro;
    }

    public void setSzuperEro(double szuperEro) {
        this.szuperEro = szuperEro;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return "Bosszuallo{" +
                "szuperEro=" + szuperEro +
                ", vanEGyengesege=" + vanEGyengesege +
                '}';
    }
}

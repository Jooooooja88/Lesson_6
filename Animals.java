package ru.geekbrains.skryabinegor.lesson6;

public class Animals {
    protected int maxrun;
    protected int maxswimming;
    protected double maxjump;

    Animals(int maxrun,int maxswimming, double maxjump)
    {
        this.maxrun = maxrun;
        this.maxswimming = maxswimming;
        this.maxjump = maxjump;
    }
    public void animalprint()
    {
        System.out.println();
    }
}

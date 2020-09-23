package ru.geekbrains.skryabinegor.lesson6;

public class Dog extends Animals
{

    Dog(int maxrun, int maxswimming, double maxjump)
    {
        super(maxrun, maxswimming, maxjump);

    }
    public void dogprint()
    {
        System.out.println("Restrictions dog: Run " + maxrun + " Swimming " + maxswimming + " Jump " + maxjump );

    }

}

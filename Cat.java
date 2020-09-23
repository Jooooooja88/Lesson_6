package ru.geekbrains.skryabinegor.lesson6;

public class Cat extends Animals
{
    Cat(int maxrun, int maxswimming, double maxjump)
    {
        super(maxrun, maxswimming, maxjump);

    }
    public void catprint()
    {
        System.out.println("Restrictions cat: Run " + maxrun + " Swimming " + maxswimming + " Jump " + maxjump );

    }

}

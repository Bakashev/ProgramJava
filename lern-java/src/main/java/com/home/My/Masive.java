package com.home.My;

public class Masive
{
    public static void main (String args[])
    {
        int sample[] = new int[10];
        for (int i=0;i<10;i++)
        {
            sample[i]=i;
        }

        for (int i=0;i<10;i++)
        {
            System.out.println("Введенное число" + sample[i]);

        }
    }
}

package com.home.My;

public class SigeEffects
{
    public static void main (String args [])
    {
        int i = 0;
        if (false & (++i < 100))
        {
            System.out.println("Это строка не будет отображаться");
        }
    System.out.println("Инструкция if выполняется " +i);


        if (false&&(++i<100))
        {
            System.out.println("Это строка не будет отображаться");
        }
        System.out.println("Инструкция if выполняется " +i);
        i=128;
        byte b;
        b=(byte)i;
        System.out.println(b);
    }

}
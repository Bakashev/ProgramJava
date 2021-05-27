package com.home.My;

public class PromDemo
{
    public static void main (String args [])
    {
        int i;
        byte b;
        b=10;
        i=b*b;
        System.out.println(i + " Значение b "+b);

        b=10;
        b=(byte)(b*b);
        System.out.println(b);
        for (i=0;i<5;i++)
        {
            System.out.println(i + "/3 :" + (i/3));
            System.out.println(i +"/3"+ (double)i/3);
            System.out.println("One\t" + "two\t" + "Three");
        }

    }

}

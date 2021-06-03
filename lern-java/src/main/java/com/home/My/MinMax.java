package com.home.My;

public class MinMax
{
public static void main(String args[])
{
int min,max;
    int num [] = new int[10];
        num[0]=12;
        num[1]=-12;
        num[2]=-212;
        num[3]=1232;
        num[4]=12;
        num[5]=4123412;
        num[6]=12;
        num[7]=12;
        num[8]=12;
        num[9]=147636712;
    min=max=num[1];
    for (int i=0;i<12;i++)
    {
        if (num[i]<min) min=num[i];
        if (num[i]>max) max=num[i];
    }
    System.out.println("Минимальное значение " +min);
    System.out.println("Максимальное значение " +max);
}
}

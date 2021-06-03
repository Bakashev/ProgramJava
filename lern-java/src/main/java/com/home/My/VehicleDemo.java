package com.home.My;

class Vehicle
{
    int pessengers;
    int fuelcup;
    int mpg;
int range()
{
    return fuelcup*mpg;
}
}
public class VehicleDemo
{
    public static void main(String args [])
    {
        int range;
    Vehicle minivan = new Vehicle();
    minivan.pessengers =7;
    minivan.mpg = 21;
    minivan.fuelcup=16;
    range= minivan.range();
       System.out.println("Мини фургон может перевезти " + minivan.pessengers + "пассажиров на росстояние");
       System.out.println("Количесвто миль " + range);
        minivan.range();


    }
}

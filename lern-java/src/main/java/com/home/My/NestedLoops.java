package com.home.My;

public class NestedLoops
{
    public static void main(String args[])
    {
        for (int i =2;i<100;i++)
        {
            System.out.print("Number i =" + i + " :");
           //for(int j = 2;j<i;j++ )
            for (int j=2;j<=Math.sqrt(i);j++)
            {
                //System.out.println("квадратный корень" +i+ "=" +
                  //      Math.sqrt(i));
                if (i%j==0)
                {

                    System.out.print(j + " ");
                    if ((i/j)!=j) System.out.print((i/j) + " ");
                }

            }

            System.out.println();

        }


    }
}

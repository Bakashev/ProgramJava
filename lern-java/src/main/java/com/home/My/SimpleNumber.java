package com.home.My;

public class SimpleNumber
{
    public static void main (String args [])
    {
        int i,j;
        boolean isprime;
        for (i=2;i<100;i++)
        {
            isprime = true;
         //   System.out.println(i );
            for (j=2;j<=i/j;j++)
            {
              //  System.out.println(i + " " + j);
                if ((i%j)==0)
                //   System.out.println(i + " " + j);
                     isprime = false;
            }
            if (isprime)
                System.out.println(i + " простое число");

        }


    }

}

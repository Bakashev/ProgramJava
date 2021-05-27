package com.home.My;

public class LogicalOpTable
{
    public static void main(String args[])
    {
        boolean p,q;
        int i,j;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p=true; q=true;

            i=1;
            //j=1;
            System.out.print(i + "\t\t"+ i +"\t\t");

        if (p&q)
            {
                i=1;
                System.out.print(i+"\t\t");
            }
            else
            {
                i=0;
                System.out.print(i+"\t\t");
            }
        if (p|q)
            {
                i=1;
                System.out.print(i+"\t\t");
            }
            else
            {
                i=0;
                System.out.print(i+"\t\t");
            }
        if (p^q)
            {
                i=1;
                System.out.print(i+"\t\t");
            }
            else
            {
                i=0;
                System.out.print(i+"\t\t");
            }
            if (!p)
            {
                i=1;
                System.out.println(i+"\t\t");
            }
            else
            {
                i=0;
                System.out.println(i+"\t\t");
            }
        p=true; q=false;

            i=1;
            System.out.print(i + "\t\t");
            i=0;
            System.out.print(i +"\t\t");

        if (p&q)
        {
            i=1;
            System.out.print(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.print(i+"\t\t");
        }
        if (p|q)
        {
            i=1;
            System.out.print(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.print(i+"\t\t");
        }
        if (p^q)
        {
            i=1;
            System.out.print(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.print(i+"\t\t");
        }
        if (!p)
        {
            i=1;
            System.out.println(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.println(i+"\t\t");
        }
        p=false; q=true;
        i=0;
        System.out.print(i + "\t\t");
        i=1;
        System.out.print(i +"\t\t");
        if (p&q)
        {
            i=1;
            System.out.print(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.print(i+"\t\t");
        }
        if (p|q)
        {
            i=1;
            System.out.print(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.print(i+"\t\t");
        }
        if (p^q)
        {
            i=1;
            System.out.print(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.print(i+"\t\t");
        }
        if (!p)
        {
            i=1;
            System.out.println(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.println(i+"\t\t");
        }
        p=false; q=false;
        i=0;
        System.out.print(i + "\t\t");
        i=0;
        System.out.print(i +"\t\t");
        if (p&q)
        {
            i=1;
            System.out.print(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.print(i+"\t\t");
        }
        if (p|q)
        {
            i=1;
            System.out.print(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.print(i+"\t\t");
        }
        if (p^q)
        {
            i=1;
            System.out.print(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.print(i+"\t\t");
        }
        if (!p)
        {
            i=1;
            System.out.print(i+"\t\t");
        }
        else
        {
            i=0;
            System.out.print(i+"\t\t");
        }


        //System.out.println((p^q)+"\t"+(!p));

       /*
        p=true; q =false;
        System.out.print(p +"\t" +q+ "\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p));

        p=false; q =true;
        System.out.print(p+"\t"+ q+("\t"));
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p)+"\t");

        p=false; q=false;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.print((p^q)+"\t"+(!p));
        */
    }
}

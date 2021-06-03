package com.home.My;

public class Registr
{
    public static void main (String args [])
    throws java.io.IOException
    {
        char ch, end;
       // System.out.print("Enter text in line:");
        //ch = (char)System.in.read();
        do
        {

            ch=(char)System.in.read();
            if (ch >='a'& ch<='z')
            {
                ch += 32;
                System.out.print(ch);
            }



        } while (ch!='.');



    }
}

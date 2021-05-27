package com.home.My;

import java.io.IOException;
import  java.io.InputStream;

public class KbIn
{
    public static void main(String args[])
        throws java.io.IOException
            {
            char ch;
            System.out.println("Enter number? after that push Enter");
            ch = (char) System.in.read();
            System.out.println("Вы нажали клавишу:" + ch);

            }


}

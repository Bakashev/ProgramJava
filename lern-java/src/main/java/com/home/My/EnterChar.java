package com.home.My;

public class EnterChar
{
    public static void main (String args[])
    throws java.io.IOException {
        char ch, end;
        int count = 0;

        System.out.print("Enter letter:");
        ch = (char) System.in.read();
        do {
            end = (char) System.in.read();
            if (end == ' ') {
                count++;
            }
        }
        while (end != '.');

        System.out.println(count);
        int countQ = 0;
        for (int i = 0; i <= 1000; i = i + 2) {

            countQ++;
            System.out.println(i);

        }
        System.out.println(countQ);

        for (int i = 1; i<1000; i=i+i)
        {
            System.out.println(i);
        }
        // Смена регистра
        char ch2,ignore;

        ch2 = (char) System.in.read();
        do
        {
         end = (char)System.in.read();
         if (65<(int)end | (int)end <90)
        {
            int step = 32;
            int result = (int)end+step;
             end = (char)result;
             System.out.print(end);
        }

        }
        while (ch2!='.');
      // System.out.print(ch2);
    }

}

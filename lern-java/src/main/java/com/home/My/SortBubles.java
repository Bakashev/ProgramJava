package com.home.My;
class Sort
{
        void print (int bubl [])
    {
        int bublesTmp;
        int count =0;
        do
        {
            int countFor =0;
            int countIf = 0;
            for (int i = 0; i < bubl.length - 1; i++)
            {

                if (bubl[i] > bubl[i + 1])
                {
                    bublesTmp = bubl[i + 1];
                    bubl[i + 1] = bubl[i];
                    bubl[i] = bublesTmp;
                    countIf++;
                    countFor=countIf;
                   // System.out.print(countFor);
                }


            }
            count=countFor;
            //System.out.print(count);
        }
        while (count!=0);
        for (int i =0;i<bubl.length;i++)
        System.out.println(bubl[i]);

    }

}

public class SortBubles {
    public static void main(String args[])
    {

        int bubles[] = {9, 12, 2, 1, 2, 26};
        int bubles2[] = {234,5344,123,543,6,234,2,978,456,3,123,5435,66,7,8,234};



       /* for (int i=0; i<bubles.length;i++)
        System.out.println(bubles[i]);*/
        Sort mas = new Sort();
        System.out.println("Первый массив");
        mas.print(bubles);
        System.out.println("Второй массив");
        mas.print(bubles2);
    }
}
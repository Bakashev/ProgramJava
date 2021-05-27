package com.home.My;

public class DuymToMetr 
{
	public static void main (String args[])
	{
		int duym=1;
		int funt=1;
		int funt1 = 16;
	   // double kolDuym = 12*funt1;
		double kof = 1/39.37;
		
		
		for (int i =0; i<funt1;i++)
		{
			for (int j =0;j<12;j++)
			{
				System.out.println(duym + " Дюйм = " + duym*kof + " метра" );
				duym++;
				
			}
			System.out.println(funt + "фунт равен " +  (duym-1)*kof + " метра");
			System.out.println();
			funt ++;
			/*for (int duym =str*12+1;duym!=kolDuym+1;duym++)
			{
			System.out.println(duym + " дюйм равен " + duym*kof + " метра");
			str++;
			if (str==12)
			{
				funt1 = duym/12;
				System.out.println(funt1 + " фунт равен " + duym*kof);
				System.out.println();
				str=0;
				
			}
			}
		
			 */
		
	}
}
}

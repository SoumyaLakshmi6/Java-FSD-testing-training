package Day1;

import java.util.Scanner;

public class sample1 {
	class Basics
	{	
		static int samp=5;//global variable (class varaible)
		public static void main(String[] args)
		{
			
			double a,b,c;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the first value");
			a=s.nextDouble();
			System.out.println("enter the Second value");
			b=s.nextDouble();
			c=a+b;
			System.out.println("sum="+c);
			
		}
		/*public static void showsample()
		{
			int x=15;//local variable
			System.out.print(c);
			
		}*/
	}


}

package Day1;

import java.util.Scanner;

public class Basic_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the 1st Number A= ");
		int num1 =SC.nextInt();
		System.out.println("Enter Second number B =");
		int num2 = SC.nextInt();
		System.out.println("Enter 3rd number C=");
		int num3 = SC.nextInt();
		sum = num1+num2+num3;
		System.out.println("Sum of 3 numbers are : "+sum);
		
		

	}

}

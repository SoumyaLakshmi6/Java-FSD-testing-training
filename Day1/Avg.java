package Day1;

import java.util.Scanner;

public class Avg {
	 
	public static void main(String[] args) {
		double DB;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value A: ");
		double A =sc.nextDouble();
		System.out.println("Enter the 2nd Value B: ");
		double B = sc.nextDouble();
		System.out.println("Enter the 3rd Value C: ");
		double C = sc.nextDouble();
		DB = (A+B+C)/3;
		System.out.println(" Avarage of A, B, C is: "+DB);
		
		
		
		
	}

}

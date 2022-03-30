package Day2;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		double c;
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		c=a+b;
		System.out.println("Sum = "+c);
		c=a-b;
		System.out.println("Difference"+c);
		c=a*b;
		System.out.println("Product" +c);
		c=a/b;
		System.out.println("Quotient"+c);
		c=a%b;
		System.out.println("Reminder"+c);
		a+=b;
		System.out.println("A="+a);
		int d=1;
		d++;
		System.out.println("D= "+d);
		d--;
		System.out.println("E= "+d);

	}

}

package Day7;

import java.util.Scanner;

public class OneArray1 {
	public static void main(String[]args) {
		 int a[] = new int[10], i ;
	        Scanner A = new Scanner(System.in);
	        for(i=0;i<10;i++)
	        {
	        System.out.print("Enter number "+(i+1)+ " in array=");
	        a[i] = A.nextInt();
	        }
	       System.out.println("You have entered the following values in Array:");
	       for(i=0;i<10;i++)
	           System.out.print(a[i]+", ");
	}
}

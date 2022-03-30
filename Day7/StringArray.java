package Day7;

import java.util.Scanner;

public class StringArray {
	  
	 public static void main(String[]args) {
		 
		 int i;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the Size of Array: ");
	      int A = sc.nextInt();
	      int[] arr = new int[A];
	      
	      System.out.println("Enter " +A+ " Elements for the Array: ");
	      for(i=0; i<A; i++)
	         arr[i] = sc.nextInt();

	      
	      System.out.println("\nReverse of Given Array is: ");
	      for(i=(A-1); i>=0; i--)
	         System.out.print(arr[i]+ " ");

		 
	
	    }  

}

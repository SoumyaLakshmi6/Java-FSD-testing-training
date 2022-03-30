package Day7;

import java.util.Scanner;

public class OneArray2 {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int arr[] = new int[5];
	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < 5; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int max = arr[0], sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	                
	            if (arr[i] > max)
	                max = arr[i];
	                
	            sum += arr[i];
	        }
	        
	        System.out.println("Largest Number = " + max);
}
}

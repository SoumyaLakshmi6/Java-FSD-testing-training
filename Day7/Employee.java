package Day7;

import java.util.Scanner;


public class Employee {
	public static void main(String args[]) {

        System.out.print("Enter How many employee:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Enter the Employee Name: ");
        String[] name = new String[k];
        System.out.println("Enter Employee's Salary: ");
        int[]sal =  new int[k];
        System.out.println("Enter Date of Joining: ");
        int[]yr = new int[k];
        for(int i=0;i>k;i++) 
        {
        	name[i] = sc.next();
        	sal[i] = sc.nextInt();
        	yr[i] = sc.nextInt();
        	}
        System.out.println("Employee data");
        for (int i=0;i<k;i++)
        {
        	System.out.println("Employee name, salary and Date of Joining :" + name[i] + "Name " + sal[i] + "Salary " + yr[i]+"Year of joining");
               System.out.println(" ");
        }

	}
}


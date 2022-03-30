package Day2;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int Age = sc.nextInt();
		System.out.println("Enter your weight: ");
		double Weight = sc.nextDouble();
		if((Age>=18)){
			if((Weight>=50)) {
				System.out.println("You can donate blood");
			}
			else {
				System.out.println("You are not able to donate blood");
				}
		}
		else {
			System.out.println("Your age must be greater than 18");
		}
		
		}
	}


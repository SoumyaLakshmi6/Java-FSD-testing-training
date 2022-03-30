package Day2;

import java.util.Scanner;

public class ExmpSwitch {

	public static void main(String[] args) {
		System.out.println("1:Monday, 2:Tueday, 3:Wednesday, 4:Thursday, 5:Friday, 6:Saturday, 7:Sunday");
	System.out.println("Enter a number: ");
	Scanner sc = new Scanner(System.in);
	int Num = sc.nextInt();
	switch(Num) {
	case 1: System.out.println("Today is Monday");
	System.out.println("1:10AM, 2:11AM, 3:12PM, 4:1PM");
	System.out.println("Select a slot: ");
	int time = sc.nextInt();
	switch(time)
	{
	case 1:System.out.println("Your slot is booked for 10AM");
	break;
	case 2:System.out.println("Your slot is booked for 11AM");
	break;
	case 3:System.out.println("Your slot is booked for 12PM");
	break;
	case 4:System.out.println("Your slot is booked for 1PM");	
	break;
	}
	break;
	case 2: System.out.println("Today is Tuesday");
	System.out.println("1:10AM, 2:11AM, 3:12PM, 4:1PM");
	System.out.println("Select a slot: ");
	int Time = sc.nextInt();
	switch(Time)
	{
	case 1:System.out.println("Your slot is booked for 10AM");
	break;
	case 2:System.out.println("Your slot is booked for 11AM");
	break;
	case 3:System.out.println("Your slot is booked for 12PM");
	break;
	case 4:System.out.println("Your slot is booked for 1PM");	
	}
	break;
	case 3: System.out.println("Today is Wednesday");
	System.out.println("1:10AM, 2:11AM, 3:12PM, 4:1PM");
	System.out.println("Select a slot: ");
	int TIME = sc.nextInt();
	switch(TIME)
	{
	case 1:System.out.println("Your slot is booked for 10AM");
	break;
	case 2:System.out.println("Your slot is booked for 11AM");
	break;
	case 3:System.out.println("Your slot is booked for 12PM");
	break;
	case 4:System.out.println("Your slot is booked for 1PM");	
	}

	break;
	case 4: System.out.println("Today is Thursday");
	System.out.println("1:10AM, 2:11AM, 3:12PM, 4:1PM");
	System.out.println("Select a slot: ");
	int TIme = sc.nextInt();
	switch(TIme)
	{
	case 1:System.out.println("Your slot is booked for 10AM");
	break;
	case 2:System.out.println("Your slot is booked for 11AM");
	break;
	case 3:System.out.println("Your slot is booked for 12PM");
	break;
	case 4:System.out.println("Your slot is booked for 1PM");	
	}

	break;
	case 5: System.out.println("Today is Friday");
	System.out.println("1:10AM, 2:11AM, 3:12PM, 4:1PM");
	System.out.println("Select a slot: ");
	int TIMe = sc.nextInt();
	switch(TIMe)
	{
	case 1:System.out.println("Your slot is booked for 10AM");
	break;
	case 2:System.out.println("Your slot is booked for 11AM");
	break;
	case 3:System.out.println("Your slot is booked for 12PM");
	break;
	case 4:System.out.println("Your slot is booked for 1PM");	
	}

	break;
	case 6: System.out.println("Today is Saturdayday");
	System.out.println("1:10AM, 2:11AM, 3:12PM, 4:1PM");
	System.out.println("Select a slot: ");
	int TiMe = sc.nextInt();
	switch(TiMe)
	{
	case 1:System.out.println("Your slot is booked for 10AM");
	break;
	case 2:System.out.println("Your slot is booked for 11AM");
	break;
	case 3:System.out.println("Your slot is booked for 12PM");
	break;
	case 4:System.out.println("Your slot is booked for 1PM");	
	}

	break;
	case 7: System.out.println("Today is Sunday");
	System.out.println("1:10AM, 2:11AM, 3:12PM, 4:1PM");
	System.out.println("Select a slot: ");
	int TimE = sc.nextInt();
	switch(TimE)
	{
	case 1:System.out.println("Your slot is booked for 10AM");
	break;
	case 2:System.out.println("Your slot is booked for 11AM");
	break;
	case 3:System.out.println("Your slot is booked for 12PM");
	break;
	case 4:System.out.println("Your slot is booked for 1PM");	
	}

	break;
	
	}

	}

}

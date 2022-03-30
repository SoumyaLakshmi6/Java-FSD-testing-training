package Day7Assignment;

import java.util.Scanner;

public class Question4 {
	public static int count(String str1, char c)
    {
        int res = 0;
 
        for (int i=0; i<str1.length(); i++)
        {
            if (str1.charAt(i) == c)
            res++;
        }
        return res;
    }
     

    public static void main(String args[])
    {
    	String str1;
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter first string: ");
		str1 = in.nextLine();
        char c;
        System.out.println("Enter the character: ");
        c=in.next().charAt(1);
        System.out.println(count(str1, c));
    }
}



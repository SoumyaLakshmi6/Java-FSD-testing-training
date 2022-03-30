package Day14;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class question1 {
	static File obj = new File("soumya.txt");
	
	static Scanner a = new Scanner(System.in);
	 public static void create() throws Exception
	 {
		 if(obj.createNewFile())
		 {
			 System.out.println("File Created");
		 }
	 }
	 
	 public static void writein()throws Exception
	 {
		 FileWriter b = new FileWriter(obj);
		 System.out.println("Enter Text");
		 String c = a.nextLine();
		 b.write(c);
		 b.close();
		 Scanner r = new Scanner(obj);
		 String e = r.nextLine();
		 System.out.println(e);
		 
	 }
	public static void main(String[] args) throws Exception
	{
		create() ;
		writein(); 
	}

}

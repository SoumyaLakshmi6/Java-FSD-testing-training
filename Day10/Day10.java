package Day10;

public class Day10 {
		   public static void main(String[] args) {
		      String str = "Hello World";
		      try {
	    	str.charAt(28);
		    System.out.println("String Index is valid");
		      } 
		      catch (StringIndexOutOfBoundsException e) {
		      System.out.println("String Index is out of bounds");
		      }
		   }
		}

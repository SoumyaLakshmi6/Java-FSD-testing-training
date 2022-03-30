package Day18Assignment;
import java.io.*;
import java.util.*;

public class Hashtable1 {
	
	    public static void main(String args[]) { 
			Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
		    map.put(1,"John");    
		    map.put(2,"Stephen");   
		    map.put(4,"Soumya");    
		    map.put(3,"Lakshmi");    
		    System.out.println("Before remove: "+ map);   
		    // Remove value for key 102  
		    map.remove(102);  
		    System.out.println("After remove: "+ map);  
		    //checking empty or not
		    System.out.println("map is empty? "+map.isEmpty());
		    //Here, we specify the if and else statement as arguments of the method  
		    System.out.println(map.getOrDefault(101, "Not Found"));  
		    System.out.println(map.getOrDefault(105, "Not Found")); 
		    //Inserts, as the specified pair is unique  
		    map.putIfAbsent(102,"Linchu");  
		    System.out.println("Updated Map: "+map);  
		    //Returns the current value, as the specified pair already exist  
		    map.putIfAbsent(101,"Aleena");  
		    System.out.println("Updated Map: "+map);
		    //Replace the value at key 100
		    map.replace(100,"Rachel");
		    System.out.println("Updated Map: "+map);
		    //Checking values in map
		    System.out.println("Aleena in map? "+map.contains("Aleena"));
		    System.out.println("Rachel in map? "+map.contains("Rachel"));
		    //Checking key in map and getting the value
		    if(map.containsKey(101)==true) {
		    	System.out.println("Vlaue of key 1 is "+map.get(1));
		    }
		    //printing all values in map
		    System.out.println(map.values());
		    if(map.replace(3,"Lakshmi","Thomas")==true) {
		    	System.out.println("Replaced Lakshmi...");
		    	System.out.println("Updated Map: "+map);
		    }
		    
		}  
	}


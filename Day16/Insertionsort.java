package Day16;

public class Insertionsort {
		   public static void main(String args[]){
		      int array[] = {10, 70, 25, 20, 63, 96, 57};
		      int size = array.length;

		      for (int i=1 ;i< size; i++){
		         int val = array[i];
		         int j = i;

		         while(array[j-1]>val && j>0){
		            array[j] = array[j-1];
		            j = j-1;
		         }
		         array[j] = val;
		      }

		      for (int i=0 ;i< size; i++){
		         System.out.print(" "+array[i]);
		      }
		   }
		}



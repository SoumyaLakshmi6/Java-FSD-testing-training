package Day16;
import java.io.*;
public class sortArray {
int a[];
int n;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public sortArray(int N) // Constructor
{
a = new int[N];
n = N;
}
public static void main(String args[]) throws IOException
{
System.out.print("\nEnter the size of the array : ");
int nn = Integer.parseInt(br.readLine());
sortArray call = new sortArray(nn);
// Read array from user
System.out.println("\nEnter " +nn +" elements :");
call.readArray();
// Ask for choosing the sorting technique
System.out.println("Choose Sorting Technique :\n");
System.out.println("1 : Bubble Sort");
System.out.println("2 : Selection Sort");
int choice = Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
call.bubbleSort();
break;
case 2:
call.selectionSort();
break;
default :
System.out.println("\nInvalid Choice !");
System.exit(1);
break;
}
call.display(); // Print the sorted array
}
public void readArray() throws IOException
{
for(int i=0;i<n;i++)
a[i] = Integer.parseInt(br.readLine());
}
public void bubbleSort()
{
int t;
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1-i;j++)
{
if(a[j]>a[j+1])
{
t = a[j];
a[j] = a[j+1];
a[j+1] = t;
}
}
}
}
public void selectionSort()
{
int t, min;
for(int i=0;i<n-1;i++)
{
min = i;
for(int j=i+1;j<n;j++)
{
if(a[min]>a[j])
min = j;
}
if(min!=i)
{
t = a[min];
a[min] = a[i];
a[i] = t;
}
}
}
public void display()
{
System.out.println("\nSorted Array :");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
}



package assigment1;
import java.util.Scanner;
public class Fibnumbers2 {

	    public static void main (String args[]){ // it is the main method
	    	long beginTimer =System.currentTimeMillis();// took the beginning time 
			System.out.print("Please enter  number for interative");// ask the user for the number 
			Scanner sc=new Scanner(System.in);  
			int n = sc.nextInt();  //  hold the number of n
		
	
		
				System.out.print ("\n iterative outputs are that:");
				
				for (int i = 0 ; i < n; i++)
				{
					System.out.print (fiboSeries (i) + " "); // to produce output for fibonacci number
				
				}
		       long endTimer = System.currentTimeMillis();
				
				long between = (endTimer - beginTimer); // calculate the time between starting and ending
				                                       //code from https://stackoverflow.com/questions/13062345/measuring-time-differences-
                                                      //using-system-currenttimemillis
				System.out.print("\nTiming for interative in the  program: " + between +" miliseconds");
				
				
				}
	

         //method: fiboSeries
		//description: iterative function which will allow the fiboseries  output
	public static int fiboSeries(int number){
			if (number == 1 || number == 2) {
				return 1;
			}
	int num1 = 1, num2 = 1, fibnumber = 0;
	for (int i = 2; i < number; i++) // code from https://stackoverflow.com/questions/44427879/find-the-sum-of-all-
		                             //the-numbers-in-the-fibonacci-series-that-are-smaller-or-equa
	{
		fibnumber= num1 + num2; // add two previous numbers
		num1 = num2;
		num2 = fibnumber;

	}
	return fibnumber; // Fibonacci number
	}	
	}


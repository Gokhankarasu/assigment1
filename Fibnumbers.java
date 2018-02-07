// calling the class Fibnumbers
package assigment1;

import java.util.Scanner;

public class Fibnumbers {

public static void main (String args[]){ // it is the main method
	
		// Recursive Function 
		long beginTimer =System.currentTimeMillis();// took the beginning time 
		System.out.print("Please enter  number for recursive");// ask the user for the number 
		Scanner sc=new Scanner(System.in);  
		int n = sc.nextInt();  //  hold the number of n
	
		System.out.print("Recursive output:" + n1 + " " + n2 ); // print out the recursive function
		Recursive( n-2);
		
		// net timing
		 long endTimer = System.currentTimeMillis(); // the process end time
			
		long between = (endTimer - beginTimer); // calculate between starting and finishing 
		                                        //code from https://stackoverflow.com/questions/13062345/measuring-time-differences-
		                                        //using-system-currenttimemillis
		System.out.print("\nTiming for executing the program: " + between +" miliseconds"); // print out the time
			
}
	 	//method: fiboSeriesRec 
		//description: it will produce the Fibonacci series of numbers 
		
	static int n1 = 0 , n2 = 1, n3 = 0; 
	static void Recursive(int number){
		if (number > 0){
			n3 = n1+n2;
			n1=n2;
			n2 = n3;
			System.out.print(" "+n3);
			Recursive(number-1);
		}

	}
}
		
		
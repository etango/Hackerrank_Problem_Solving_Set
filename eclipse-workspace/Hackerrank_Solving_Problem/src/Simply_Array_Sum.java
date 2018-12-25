import java.io.*;
import java.math.*;
import java.util.*;

public class Simply_Array_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Array;
		
		//Declaring the size of the array.
		System.out.println("The amount of number you wish to enter?");
		int c = sc.nextInt();
		Array = new int[c];
		int sum = 0;
		
		//This for loop take in number to the array and add the total of each number to declare variable sum.
		for(int i=0;i<Array.length;i++) {
			
			System.out.println("Enter a number:");
			Array[i] = sc.nextInt();
			sum += Array[i];
		}
		
		System.out.println("The total sum of the number you have enter: " + sum);
		
		sc.close();
		

	}

}

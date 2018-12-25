import java.io.*;
import java.math.*;
import java.util.*;

public class Simply_Array_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Array;
		System.out.println("The amount of number you wish to enter?");
		int c = sc.nextInt();
		Array = new int[c];
		int sum = 0;
		for(int i=0;i<c;i++) {
			
			System.out.println("Enter a number:");
			Array[i] = sc.nextInt();
			sum += Array[i];
		}
		
		System.out.println("The total sum of the number you have enter: " + sum);
		
		sc.close();
		

	}

}

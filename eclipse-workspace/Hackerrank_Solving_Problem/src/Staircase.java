import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
   
    	
    	//using two for loop to build the staircase. 1st for loop to initial the row building
    	
    	for (int i=1;i <=n;i++) {
    		for(int j=n;j>i-1;j--) { //second for loop add if and else statement to construct the stair case with space and # depending on the row
    			if(i != j ) { //using i does not equal to j which in the first loop iteration is i=1 and j=5 we will build the space between it
    				System.out.print(" ");
    			}
    			else  { //once the second else statement where i equals to j and execute a for loop to build ## depending on the j value that has been reduced to.
    				
    				for(int k=0;k<j;k++) {
    					System.out.print("#");
    					}			
    				}    		
       			}
    		System.out.println("");
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Plus_Minus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	
    	double positive = 0.0;
    	double negative = 0.0;
    	double zero = 0.0;
    	
    	//running a for loop with if else condition statement to check for positive, negative, and zero number and add them to counter accordingly.
    	for(int i=0;i<arr.length;i++) {
    		if (arr[i] >0) {
    			positive += 1.0;
    		}
    		else if (arr[i] < 0) {
    			negative += 1.0;
    		}
    		else if (arr[i] == 0) {
    			zero += 1.0;
    		}
    	}
    	double a = (positive/arr.length); //setting variable for positive count divider by length of the array and goes from b and c for negative and zero.
    	double b = (negative/arr.length);
    	double c = (zero/arr.length);
    	System.out.printf("%1.6f %n", a); //format for decimal by using 1.6f aka #.######
    	System.out.printf("%1.6f %n", b);
    	System.out.printf("%1.6f %n", c);
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

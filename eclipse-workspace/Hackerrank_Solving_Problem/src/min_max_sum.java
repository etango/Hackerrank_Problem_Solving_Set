import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class min_max_sum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long minvalue = arr[0]; //declaring long in the event of a overflow integer where it is bigger than a 32bytes.
    	long maxvalue = arr[0];
    	long maxsum = 0;
    	long minsum = 0;

    	
    	//two for loop each task with find the min and max value of the array. Can combine to one for loop but easy for people to understand by having two for loop instead.
    	for(int i=0;i<arr.length;i++) {
    		if (maxvalue < arr[i]) {
    			maxvalue = arr[i];
    		}
    		minsum += arr[i];
    		
    	}
    	for(int i=0;i<arr.length;i++) {
    		if (minvalue > arr[i]) {
    			minvalue = arr[i];
    		}
    		maxsum += arr[i];
    		
    	}
    	
    	//taking the max and min value from the array subtracting it from the sum of the array.
    	minsum -= maxvalue;
    	maxsum -= minvalue;
    	
    	System.out.println(minsum + " " +maxsum);
    }
    	

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

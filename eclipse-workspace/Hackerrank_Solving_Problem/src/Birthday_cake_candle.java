import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Birthday_cake_candle {

    static int birthdayCakeCandles(int[] ar) {
    	//declare a count to track how many tall candles can be blown out.
    	int count=0;
    	int maxvalue = ar[0];
    	
    	//get the maxvalue from the array.
    	for (int i=0;i<ar.length;i++) {
    		if (ar[i] > maxvalue)
    			maxvalue = ar[i];
    	}
    	
    	//cycle through if statement to check matching value in the array to the max and add it to the counter.
    	for (int i=0;i<ar.length;i++) {
    		if(ar[i] == maxvalue)
    			count +=1;
    	}
    		
    	
    	return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("mytxt.txt"));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        
       
        int result = birthdayCakeCandles(ar);
        System.out.println(result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

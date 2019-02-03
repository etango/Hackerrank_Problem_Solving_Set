import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Matrix_Diagonal_Differences {
	
    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
    	
 
    	int suma = 0;
    	int sumb = 0;
    	
    	for(int i =0, j=0; i < arr.length;i++) { //for loop function to take integer digonally and add them all together
    		j=i;
    		suma += arr[i][j];  
    	}
    	
    	for(int i=0, j=arr.length-1;i<arr.length;i++) { //for loop function does the same from right to left except we are setting j equal to the length of the array - minus one because we do not know how big is the matrix.
    		sumb += arr[i][j];
    		j--;
    				
    	}
    	int x = Math.abs(suma - sumb); //using the math fucntion to get an absolute value
    	return x;
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("mytxt.txt"));

        int n = scanner.nextInt(); //noting how big the matrix will be
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n]; //building the array for teh matrix.

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) { //adding the values into the matrix
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

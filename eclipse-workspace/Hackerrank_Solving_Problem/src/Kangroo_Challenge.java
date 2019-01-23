import java.io.*;
import java.io.BufferedWriter;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangroo_Challenge {


			//method to calcaute the disance travel from starting point and compare each kangaroo
		    static String kangaroo(int x1, int v1, int x2, int v2) {
		    	
		    	String kangaroo = "YES";
		    	int k1;
		    	int k2;
		    	boolean condition = true;
		    	
		    	//check for the easiet if the starting point and jump speed are the same.
		    	if (x1 == x2 && v1 == v2) {
		    		kangaroo = "YES";
		    		condition = false;
		    		}
		    	
		    	//use a while loop to conduct 
		    	while (condition == true) {
		    	k1 = x1 += v1;
		    	k2 = x2 += v2;
		    	
		    		//check to see if x1 and x2 ever meet
		    		if(x1 == x2) {
		    			kangaroo = "YES";
		    			condition = false;
		    		}
		    		//check to see if x1 is greater than x2 an if x1 speed is greater than x1 then no need to run the test anymore. This is also condition for x2 and v2 to do the same as well.
		    		else if ((x1 > x2 && v1>v2) || (x2 > x1 && v2 > v1)  ) {
		    			kangaroo = "NO";
		    			condition = false;
		    			
		    		}//this check for any negative number input.
		    	     else if(x1 < 0 || x2 < 0 ||v1 < 0 || v2 < 0){
	                        kangaroo = "NO";
	                        condition = false;
	                    }
		    	
		    	}
		    	
		    	return kangaroo;
		    }

		    private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) throws IOException {
		        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("mytext.txt"));

		        String[] x1V1X2V2 = scanner.nextLine().split(" ");

		        int x1 = Integer.parseInt(x1V1X2V2[0]);

		        int v1 = Integer.parseInt(x1V1X2V2[1]);

		        int x2 = Integer.parseInt(x1V1X2V2[2]);

		        int v2 = Integer.parseInt(x1V1X2V2[3]);

		        String result = kangaroo(x1, v1, x2, v2);
		        
		        System.out.println(result);
		        bufferedWriter.write(result);
		        bufferedWriter.newLine();

		        bufferedWriter.close();

		        scanner.close();
		    }
		}

	



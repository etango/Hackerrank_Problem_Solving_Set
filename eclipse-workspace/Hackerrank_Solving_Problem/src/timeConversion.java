import java.io.*;
import java.math.*;
import java.sql.Time;
import java.text.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class timeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s)  {
    	
    	// using the package of simple date format to covert the string into a date value.
    	String miltary = s;
    	SimpleDateFormat mformat = new SimpleDateFormat("HH:mm:ss"); 
    	SimpleDateFormat format = new SimpleDateFormat("hh:mm:ssa");
    	Date time;
    	
    	//using the try and catch to format the the time into a miltary time using build in function of java 8.
		try {
			time = format.parse(s);
			miltary = mformat.format(time);
		} catch (ParseException e) {
			System.out.println("Error at formatting");
		}
    	
    	
    	return miltary;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("mytxt.txt"));

        String s = scan.nextLine();

        String result = timeConversion(s);


        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

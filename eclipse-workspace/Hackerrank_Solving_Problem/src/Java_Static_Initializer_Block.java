import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;


public class Java_Static_Initializer_Block {
	
	static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = true;

    static {
        int area = 0;

        // A constraint if-else statement to check if B and H are within a specific
        // value.
        if (B >= -100 && B <= 100 && H >= -100 && H <= 100) {
            area = B * H;
        } else {
            System.out.println("Please enter a value within -100 to 100");
        }

        // If-else statement is to check if Area is a positive number. If not a positive
        // number it will notify the user.
        if(area < 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }



    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}


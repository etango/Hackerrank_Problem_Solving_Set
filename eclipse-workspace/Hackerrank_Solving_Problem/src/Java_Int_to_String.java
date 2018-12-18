import java.util.*;
public class Java_Int_to_String {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String n;
		int i = sc.nextInt();
		if (i >= -100 && i <= 100) {
			 n = Integer.toString(i); //using Integer.toString() to convert an int to string.
			 System.out.print(n);		}
		
		
	}
	
	
}


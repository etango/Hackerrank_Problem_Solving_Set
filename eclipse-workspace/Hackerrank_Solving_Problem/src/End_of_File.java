
import java.util.*;


public class End_of_File {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int c=1;
		while (c != 0) { 
			
			String i = scan.nextLine();
			if (i != "") {
				System.out.println(c +" "+ i);
				c+=1;
			}
			else if(i == "" || i == null || i.isEmpty()) {
				c=0;
;
			}
		}
		scan.close();
	}
}

import java.util.*;
import java.math.*;


public class Compare_the_Triplets {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
		
		int A = 0;
		int B = 0;
		List<Integer> result = new ArrayList<Integer>();
		
		//for loop to compare the arrays and assign points to each one
		for(int i=0;i<a.size();i++) {
			if(a.get(i) > b.get(i)) {
				A+=1;
			}
			else if(a.get(i) < b.get(i)) {
				B+=1;
			}
			else if(a.get(i) == b.get(i)) {
				A+=0;
				B+=0;
				
			}

		}
		
		result.add(A);
		result.add(B);
		
		return result;
	}
	
	
	
	
	public static void main(String[] args) {

		
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter triple value for the first List A seperately: ");
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter a number for list A: ");
			a.add(sc.nextInt());
			
		}
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter a number for List B: ");
			b.add(sc.nextInt());
		}
		
		//calling the method
		List<Integer> result = compareTriplets(a,b);
		System.out.print(result.get(0) + " " + result.get(1));
	}

}

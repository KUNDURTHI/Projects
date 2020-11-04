package fortuneminds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for Asciivalie::");
		List<Integer> num = new ArrayList<Integer>();
		int j=0;
		for (int k = 0; k <= 5; k++) {
			num.add(sc.nextInt());
		}
		System.out.println("List of Elements entered::" + num);
			for(int i=0; i < num.size(); i++) {
				j = j + num.get(i); 
			double avg  = j/num.size();
			System.out.println("Sum of Element::"+ j+" "+"Average of Sum::" + avg);
			}
		
	
	}
}

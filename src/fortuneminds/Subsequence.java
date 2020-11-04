package fortuneminds;

import java.util.Scanner;

public class Subsequence  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter String one::");
		String s = sc.nextLine();
		System.out.println("Please enter String two::");
		String s1 = sc.nextLine();
	if(s.equals(s1)) {
		System.out.println("Match found");
	}else if(s.contains(s1)) {
		System.out.println("Sub String Match found");
	}
	
	}
}
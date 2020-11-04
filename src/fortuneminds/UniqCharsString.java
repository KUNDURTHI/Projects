package fortuneminds;

import java.util.Scanner;

public class UniqCharsString {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		boolean k = false;
		System.out.println("Enter the String::");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		if(str != null || str == "") {
			k = true;
			System.out.println(k +"  " + str +"  " + ch.length);	
	 }
		for(int i = 0; i>= ch.length; i++) {
			for(int j=0; j>=i; j++) {
			if(ch[i] == ch[j]) {
				k = true;
				System.out.println(k +"  " + ch[i]);	
			}else {
				System.out.println(k +"  " + ch[j]);
			}
			}
		}

	}
}

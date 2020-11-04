package fortuneminds;

import java.util.Scanner;

public class AsciiValue {
	
	public static void AsciiValue(String c) {
		for(int i=0; i<c.length(); i++) {
		char ch = c.charAt(i); 
		int k = (int)ch;
		System.out.println("Ascci Value::"+ch+" == " + k);
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for Asciivalie::");
		String s = sc.nextLine();
		AsciiValue.AsciiValue(s);
	}

}

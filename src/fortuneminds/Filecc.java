package fortuneminds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Filecc {
	//Reading Data from the file
	public static File writeFile(File f) throws IOException {
		FileInputStream fi = new FileInputStream(f);
		InputStreamReader isr =	new InputStreamReader(fi);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("c:/Users/ucoal/Desktop/OutTest.txt");
		String str;
		while ((str = br.readLine())!= null) {
		fw.write(str);
		fw.flush();
		System.out.println("Data from Text File::" + str.toUpperCase());
		System.out.println("Copy data from One file to another::");
		}
		return f;
	}
	
	public static String conc() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1::");
		String str = sc.nextLine();
		System.out.println("Enter String 2::");
		String st = sc.nextLine();
		System.out.println("This is string Conc::" + st);
		StringBuffer sb = new StringBuffer().append(str).append(" ").append(st);	
		String stc = sb.toString();
		// Counting the words in string
		System.out.println("This is string Conc::" + sb +" "+ "The length and words in the string::" + stc+" " + stc.trim().length());
		
		// String Checking
		
		if(str.contains(st)) {
			System.out.println("String one contains String 2");
		}else {
			System.out.println("No String Matchs");
		}
			
		return str;
		
	}

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File creation ****** on Desktop *****
		File f = new File("c:/Users/ucoal/Desktop/Test.txt");
		if (f.createNewFile()) {
			System.out.println("New File Create On Desktop");
		} else if (f.exists()) {	
			System.out.println("File Name Test Exists:" + f.getPath());
			writeFile(f);
			conc();
		}
	}

}

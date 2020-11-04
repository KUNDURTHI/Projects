package collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Ptarr {
	
	private static Scanner sc;
	public static void main(String[] args)
	{
	Ptarr pt = new Ptarr();
	pt.datainput();
	}
		public static void datainput(){
		sc = new Scanner(System.in);
		
		ArrayList<String> nb = new ArrayList<String>();
		ArrayList<String> pt = new ArrayList<String>();

		try{
			
		System.out.println("enter any charstreem:");
		nb.add(sc.next());
		System.out.println("enter any whole number consider as phone number:");
		sc = new Scanner(System.in);
		pt.add(sc.next());
		System.out.println(nb);
		System.out.println(pt);
		
		}catch(Exception e){
			
			System.out.println(pt);
			
		}
		}
}
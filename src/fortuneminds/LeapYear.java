package fortuneminds;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an year::");
		int i = sc.nextInt();
		boolean b = false;
		if (i != 0 && i % 4 == 0) {
			if (i % 100 == 0) {
				if (i % 400 == 0)
					b = true;

			} else {
				b = true;
			}
		} else {
			b = false;
		}
		if (b) {
			System.out.println( i + "is Leap year");
		} else {
			System.out.println( i + " Not Leap year");
		}
	}

}

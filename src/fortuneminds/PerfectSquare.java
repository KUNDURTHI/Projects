package fortuneminds;

import java.util.Scanner;

public class PerfectSquare {
	public static void PerfectSquare(double d) {
		double g = Math.sqrt(d);
		System.out.println("Perfect square::"+Math.round(g));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number for Perfect square::");
		double d = sc.nextDouble();
		PerfectSquare.PerfectSquare(d);
	}

}

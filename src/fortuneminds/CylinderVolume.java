package fortuneminds;

import java.util.Scanner;

public class CylinderVolume {

	public CylinderVolume(double i, double j) {
		double v = ((22 * Math.pow(i, 2) * j) / 7);
		System.out.println("Volume of the cylinder:: " + v);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radious of the Cylinder:");
		double i = s.nextDouble();
		System.out.println("Enter Hight of the Cylinder:");
		double j = s.nextDouble();
		CylinderVolume cv = new CylinderVolume(i, j);
	}

}

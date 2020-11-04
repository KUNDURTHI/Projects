package fortuneminds;

import java.util.Scanner;

public class DiscountPercentage {

	public static void getDiscount(double s, double i) {

		System.out.println("The Original price of the Product:" + s);
		System.out.println("Discount Offerd:" + i);

		double amount = (s * i / 100);
		System.out.println("Discount Provided::" + amount);
		double discAmmo = s - amount;
		System.out.println("Amount after discount::" + discAmmo);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Original Price of Product :");
		double i = s.nextDouble();
		System.out.println("Enter discount on the product:");
		double j = s.nextDouble();
		DiscountPercentage.getDiscount(i, j);
	}

}

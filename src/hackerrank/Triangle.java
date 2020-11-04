package hackerrank;

import java.util.Scanner;

public class Triangle {

	    static int lowestTriangle(int base, int area){
	        // Complete this function
	        /**** Solution One ***/
//	         int temp = base/2;
//	         int h = area/temp; 
//	         
//	         return h;
	    	/**** Solution two ***/
	       // int h = (area)/(base/2);
	    	/**** Solution three passes all test cases ***/
	        return (area * 2 + (base - 1)) / base;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the Base:");
	        int base = in.nextInt();
	        System.out.println("Enter the area:");
	        int area = in.nextInt();
	        int height = lowestTriangle(base, area);
	        System.out.println(height);
	    }
}

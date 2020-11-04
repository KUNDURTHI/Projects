package hackerrank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HandShakes {
	

	    /*
	     * Complete the handshake function below.
	     */
	 private static int handshake(int n) {
	        /*
	         * Write your code here.
	         */

	       int m = n*(n-1)/2;
	        return m;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int t = Integer.parseInt(scanner.nextLine().trim());

	        for (int tItr = 0; tItr < t; tItr++) {
	            int n = Integer.parseInt(scanner.nextLine().trim());

	            int result = handshake(n);

	            bufferedWriter.write(String.valueOf(result));
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();
	    }
	}

package accmodi;

import java.io.File;
import java.io.FileNotFoundException;


public class Inttest {
public static void main(String[] args){
	AccInterfaceDeclare ac = new AccInterfaceDeclare();
	ac.add(1, 2);
	ac.divide(4, 2);
	ac.substract(2, 4);
	ac.multiply(4, 5);
	}

	public boolean method1(String str, int a) {
		try{
			File fl = new File("c:\\test.txt");
			if(fl.exists()){
				return true;
			}
		}catch(Exception ex){
			System.out.println("Exception==>" +ex);
		}
		return false;
		}
		
	
}

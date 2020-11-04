package firecode.io;

import java.util.Scanner;

public class UniqueCharsinaString {
	public static boolean areAllCharactersUnique(String str){
	    if(str == null || str.trim().isEmpty()){
	        System.out.print(areAllCharactersUnique(str));
	    	return true;
	    }else{
	    for(int i=0; i<str.length(); i++)
	        for(int j=0; j<str.length(); j++){
	           if(str.charAt(i) == str.charAt(j))
	        	   return true;
	        }
	    }
	    return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(UniqueCharsinaString.areAllCharactersUnique(s)) {
			System.out.println(s);
		}else {
			System.out.println(s);	
		}
	}

}

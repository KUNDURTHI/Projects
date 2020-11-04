package collections;

public class ReserveString {

		public void reserveString(char[] ch, int i) {
			if (i > 0) {
				char c1 = ch[i - 1];
				i--;
				//StringBuffer cb = new StringBuffer();	
				System.out.print(c1);
				reserveString(ch, i);
			}
		}

	public void reverseStringArray(String s) {
		String[] sc = s.split(" ");
		StringBuffer cb = new StringBuffer();
		for(int i = sc.length-1; i>=0; i--)		
			cb.append(" ").append(sc[i]);
				String c = cb.toString();
				System.out.println(c);
					
			}
	public static String reverseOfString(String str){
	    String inputString = str;
	    String outputString = null;
	    if(inputString == " " && inputString == ""){
	     return outputString;
	    }else if(inputString != null){
	        StringBuilder sb = new StringBuilder ();
	        
	        for (int i = inputString.length() -1; i>=0 ; i--)
	            
	            sb.append(inputString.charAt(i));
	        System.out.printf("Printing the reverse of the String::", inputString);
	    }
	    return inputString;
	    
	}
	

	public static void main(String[] args) {
		ReserveString pap = new ReserveString();
		String s = "CIVI";

		String sc = "This is a Reverse String Array";
		pap.reverseStringArray(sc);
		pap.reverseOfString(sc);
		char[] c = s.toCharArray();
		int i = c.length;
		pap.reserveString(c, i);
	}
	
	public static String strrev(String str) {
		int i;
		int strlen = str.length();
		
		return str;
		
	}

}

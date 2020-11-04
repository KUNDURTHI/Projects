package accmodi;

public class StrinngPool {

	public String stringpool(String s) {
		s= new String("satya + Venkata");
System.out.println("String New Method" + s);
		return s;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrinngPool sp = new StrinngPool();
		
		String s ="Satya"; //String Literal Method.
	//	System.out.println("String Literal Method::" + s);
		sp.stringpool(s);
		
	}

}

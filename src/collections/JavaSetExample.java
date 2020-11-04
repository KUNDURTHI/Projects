package collections;

import java.util.HashSet;

public class JavaSetExample extends ArrayListExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample Ar = new ArrayListExample();
		Thread te = new Thread(new linkliste());	
		te.start();		
	
		HashSet<String> st = new HashSet<>();
		st.add("Q");
		st.add("Q");
		st.add("Q");
		st.add("Q");
		st.add("F");
		st.add("H");
		st.add("Y");
		st.add("U");
		st.add("W");
		System.out.println("Data==> " + st.toString());

	}

}

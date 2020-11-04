package collections;

import java.util.HashMap;

public class ExampleHashmap implements Runnable {
public static void main(String[] args){
	ExampleHashmap ex = new ExampleHashmap();
	ex.ExampleHashmap();
}

public void ExampleHashmap() {
	HashMap<String,String> hm = new HashMap<String,String>();
	hm.put("Satya", null);
	hm.put("Shailesh", null);
	hm.put("Shailesh1", "3000000");
	hm.put("Ram1", "300");
	hm.put("Shyam", "300");
	hm.put("Krish", "300");
	hm.put("Ram1", "40000");
	hm.put("Ram1", "70000");
	System.out.println("Data===> " + hm.toString());	
}

@Override
public void run() {
	// TODO Auto-generated method stub
	ExampleHashmap();
}
}

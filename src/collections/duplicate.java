package collections;

import java.util.HashMap;
import java.util.Map;

import nullpointer.Car;
public class duplicate implements Runnable {
@SuppressWarnings("rawtypes")
public void dupli(String st){	
	HashMap<Character,Integer> st1 = new HashMap<>();
		char[] strch = st.toCharArray();
for(char c : strch){
	if(st1.containsKey(c)){
	st1.put(c,st1.get(c)+1);
}else{
	st1.put(c, 1);
	}
	
}

for(Map.Entry e:st1.entrySet()){
	System.out.println(e.getKey() +" "+e.getValue());

}
}
@Override
public void run() {
	// TODO Auto-generated method stub
	duplicate dp = new duplicate();
	dp.dupli("Satyanarayana");
	ExampleHashmap ex = new ExampleHashmap();
	ex.ExampleHashmap();	
/*	Nullpointer np = new Nullpointer();
	Car c = new Car();
	c.getHonda();*/
}
}
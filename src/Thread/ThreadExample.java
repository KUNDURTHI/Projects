package Thread;

import java.util.HashSet;
import java.util.Set;

import collections.ArrayListExample;
import collections.duplicate;

public class ThreadExample {

	public static void main(String[] args) {
	//	Thread t = new Thread(new duplicate());
		Thread t1 = new Thread(new ArrayListExample());
	//	t.start();
		t1.start();
	
	}	
}

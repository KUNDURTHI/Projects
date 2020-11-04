package accmodi;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Enum1 {

	static class Helper{
		private int data = 5;
		public void bump(int inc){
			inc++;
			data = data + inc;
		}
	}
	
	public static void main(String args[]){
	
		Helper h = new Helper();
		int data = 2;
		h.bump(data);
		System.out.print(h.data + " " + data);
		
		Supplier<String> i = () -> "Car";
		Consumer<String> c = x -> System.out.print(x.toLowerCase());
		Consumer<String> d = x -> System.out.print(x.toUpperCase());
		
		System.out.print(Stream.of("green","Yellow","blue").max((s1,s2) -> s1.compareTo(s2)).filter(s -> s.endsWith("n")).orElse("Yellow"));
	
	
	int a = 9, b= 2;
	float f;
	f = a/b;
	System.out.println(" f=" + f);
	f = f/2;
	System.out.println(" f=" + f);
	f = a+b/f;
	System.out.println(" f=" + f);
	}
}

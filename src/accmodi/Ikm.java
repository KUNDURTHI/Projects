package accmodi;
import java.lang.System;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
public class Ikm {
public static void  main(String args[]){
	int c=0;
System.out.print((0 == c++) ? "true" : "false");
String e = "1";
System.out.print(("1" != e) ? "true" : "false");

int a =0;
System.out.print((a !=0) ? "true" : "false");
Double d = null;
System.out.print((d) != null ? "true" : "false");

boolean b = false;
System.out.print((b = true) ? "true" : "false");

//Stream.of(new Indices("Mercury"), new Indices("Venues"), new Indices("Earth")).flatMap(i -> i.indices.stream()).mapToInt(j -> j).max().ifPresent(s -> System.out.println(s));
}
public class Indices{
	public String s;
	public List<Integer> indices;
	public Indices(String s){
		
		this.s = s;
		indices = new LinkedList<>();
		for(int i = 0; i<this.s.length(); i++){
			indices.add(i);
		}
		
	}
}
}

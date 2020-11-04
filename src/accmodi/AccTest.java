package accmodi;

import java.util.ArrayList;

public class AccTest {

	public static Integer metda(int a, int b){
		//method 1
	 // modifer static can not be used.
	a=3;
	b=6;
		int c=0;
	 c= a+b;
	 System.out.println(c);
	 return c;
	 }
	
public static void metda1(int a1, int b2){
	// not occuring method overriding
}
	//method overriding occured
/*public void metda(int a){
	this.metda(a);
	int b=10, c=0;
	a=6;
	c= a*b;
	System.out.println(c);
}*/
/*public static void AccTest(){
 ArrayList ar = new ArrayList();
 
 
 
}*/
}
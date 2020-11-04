package accmodi;

import java.io.File;
import java.io.FileReader;

public class Ikm5 {
	Ikm5(){
		Ikm5 ikm = new Ikm5();
		}


public static void main(String arg[]){
StringBuilder sb = new StringBuilder("buffering");
sb.replace(2, 7, "BUFFER");
sb.delete(2, 4);
String s = sb.substring(1,5);

System.out.println(s);
	//	meth(arg);	

File af;

}
public void meth(String[] arg){
	System.out.println(arg);
	System.out.println(arg[1]);
}
/*class MyClass{
	MyOtherClass othr = new MyOtherClass();
}*/
class MyOtherClass{
	FileReader ar;
	MyOtherClass(){}
}
}

package accmodi;

import java.util.StringJoiner;

public class Ikm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj1 = new StringJoiner(":", "[", "]");
		sj1.add("red").add("green").add("blue");
		
		StringJoiner sj2 = new StringJoiner("/", "{", "}");
		sj2.add("Yellow").add("voilet").add("orange");
		
		sj2.merge(sj1);
		System.out.println(sj2.toString());
		
String str1 = "My Strfing";
String str2 = new String ("My Strfing");
if(str1.matches(str2)){
	String str3 = str1;
	System.out.println(str3 + "3");

}if(str1 == str2){
	String str4 = str1; 
	System.out.println(str4 + "4");
}else{
	if(str1.equals(str1)){
		String str = str1;
		System.out.println(str +"1");
	}else{
		if(str1.hashCode() == str2.hashCode())
		{
			String str = str1;
			System.out.println(str +"6");
		}
	}
} 
	}
	}

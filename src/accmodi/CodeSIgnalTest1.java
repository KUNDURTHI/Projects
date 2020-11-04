package accmodi;
public class CodeSIgnalTest1 {

public int add(int param1, int param2) {
	int sum;
	
	sum = param1+param2;
	System.out.println(sum);
	return sum;
	
}
public static void main(String args[]) {
	CodeSIgnalTest1 cds = new CodeSIgnalTest1();
	
	cds.add(1, 2);
}
}

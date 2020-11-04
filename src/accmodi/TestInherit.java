package accmodi;

import java.util.HashMap;

public class TestInherit {

	private String surname;
	private String name;
	
	public TestInherit(String surname, String name) {
		this.name = name;
		this.surname = surname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

HashMap<TestInherit, String> pMap = new HashMap<>();

TestInherit testInherit1 = new TestInherit("smith", "john");
TestInherit testInherit2 = new TestInherit("smith", "john");
	
pMap.put(testInherit1, "person1");
System.out.println(pMap.get(testInherit2));
	}

}

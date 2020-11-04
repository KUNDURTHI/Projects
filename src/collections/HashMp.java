package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import accmodi.Employee;
import interfaceexe.FunctionalInterfaceExample;

public abstract class HashMp implements FunctionalInterfaceExample {
	private static final String st1 = null;
	public static void main(String[] args) throws FileNotFoundException, IOException{
	
		HashMp.heaptest();
		FunctionalInterfaceExample fie1 = (s) -> System.out.println(s);
		fie1.show("Test");
		fie1.exit("exit");
		HashMp.hashSet();
	}
	public static void heaptest() throws FileNotFoundException, IOException{
		Employee emp = new Employee("Satya","Venkata",10,10);
	
		
		FileOutputStream fOut =new FileOutputStream("C:\\Users\\ucoal\\Desktop\\State.txt");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fOut);
		objectOutputStream.writeObject(emp);
		
		//ObjectOutput out = new ObjectOutputStream();
		
		/*emp.setAge(10);
		emp.setFirstName("Satya");
		emp.setId(10);
		emp.setLastName("Venkata");
		*/
		Employee emp1 = new Employee("Satya","Venkata",10,10);
		Employee emp2 = new Employee("Satya","Venkata",29,30);
		Employee emp3 = new Employee("Kundurthi","Kv",50,60);
		HashMap<String,String> st1 = new HashMap<>();
		HashMap<String,String> st2 = new HashMap<>();
		
		Map<Employee, Employee> m1 = new HashMap<Employee, Employee>();
	
		st1.put("satya1","2");
		st1.put("satya","3");
		st1.put("satya2","4");
		st1.put("pint","2");
		st1.put("pint","2");
		st2.put("pint","2");
		st2.put("pont","2");
		st2.put("ponte","3");
		
		m1.put(emp, emp);
		m1.put(emp1, emp1);
		m1.put(emp2, emp2);
		m1.put(emp3, emp3);
		
		System.out.println(st1);
		System.out.println(st2);
		
		for(Map.Entry<Employee, Employee> m2: m1.entrySet()) {
			System.out.println("Getting the HashMap::" + m2.getKey() + " "+ ""+m1.hashCode() + m2.hashCode() +"  "+ m1.size());
		}	
			}
	public void func(){
		
		int a=0;
		for(int i=0;i<=a;i++)
		{
			String st = this.st1;
			
		}
		}
	
	//FunctionalInterfaceExample fie = () ->System.out.println("Printing the String");
	
	public static void hashSet() {
		
		HashSet<Employee> hs = new HashSet<Employee>();
        hs.add(new Employee("Satya","narayana", 20,10));
        hs.add(new Employee("Bharath","Movva", 40,5));
        hs.add(new Employee("Firoz","Khan", 30,20));
        hs.add(new Employee("Satya","narayana", 20,10));
        hs.add(new Employee("Bharath","Movva", 40,5));
        hs.add(new Employee("Firoz","Khan", 30,20));
        for(Employee emp:hs){
            System.out.println(emp);
        }
	}
	
}


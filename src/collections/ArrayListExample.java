package collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ArrayListExample extends linkliste implements Runnable{
		/*Thread te = new Thread(new linkliste());	
		te.start();	*/
	
	private static final Object PRESENT = new Object(); 
	public void arrayList() {
	
	try{
			Scanner sc = new Scanner(System.in);
			ArrayList<String> ar1 = new ArrayList<String>();
			int i = 10;
			for(i = 0; i<10; i++){
				String str = sc.nextLine();
				ar1.add(str);
			}
			System.out.println(ar1);
			
		}catch(Exception e){
			e.printStackTrace();
		
		}
	}

	public void gethashmap() {
		Set<String> hset = new HashSet<String>();
	System.out.println(hset.add("Satya"));
	System.out.println(hset.add("Satya"));
	
	
	Map<String,Object> map = new HashMap<>();
	
	map.put("a", PRESENT);
	//System.out.println(map.get("a"));
	
		hset.add("Satya");
		hset.add("SureshAnna");
		hset.add("Tammudu");
		hset.add("AshimBahi");
		hset.add("Bharath");
		hset.add("SureshAnna");
	for(int i=0; i<=hset.size(); i++) {
		if(hset.size() >0) {
			hset.add("Venkat");
		System.out.println(hset);
		}
		if(hset.contains("Satya")) {
			hset.remove("Satya");
		}
	}
	}
	
	public void getdbData() {
		
		
		try {
			Connection connect;
			connect = DriverManager.getConnection("jdbc:mysql://localhost/test", "root","root");
			Statement state = connect.createStatement();
			ResultSet result = state.executeQuery("Select * from Site_info");
		while(result.next()) {
			String data = result.getString(1);
			data = result.getString("WBS_ID");
			System.out.println(data);
		}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print("Connection Occured while connection to DB::" + e);
		}
		
	}
	
	public void run() {
		gethashmap();
		arrayList();
		getdbData();
	}
	
	LinkedList<String> l = new LinkedList<>();
	
	HashMap m = new HashMap();
	
	
}

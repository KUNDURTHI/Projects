package collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataConnect {
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
	public static void main(String args[]) {
		DataConnect db = new DataConnect();
		db.getdbData();
	}
}
	
